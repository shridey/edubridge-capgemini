package com.social.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.social.dao.Profile;
import com.social.dao.User;
import com.social.error.GlobalExceptionHandler;
import com.social.repository.ProfileRepository;
import com.social.repository.UserRepository;

import jakarta.validation.Valid;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public ResponseEntity<User> register(String username, String password) throws GlobalExceptionHandler {
		System.out.println("User Service: Register Method Called: Username: " + username + " | Password: " + password);
		
		if (this.userRepository.findByUsername(username).orElse(null) != null) {
			throw new GlobalExceptionHandler("User already exists");
		}
		
		// Save user with encoded password
        User user = new User(username, password);
		User savedUser = this.userRepository.save(user);
		
		this.profileRepository.save(new Profile(savedUser));
		
		return ResponseEntity.ok(savedUser);
	}

	@Override
	public ResponseEntity<User> findByUsername(String username) {
		System.out.println("User Service: Register Method Called: Username: " + username);
		User user = this.userRepository.findByUsername(username).orElse(null);
		if (user != null) {
			return ResponseEntity.ok(user);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@Override
	public ResponseEntity<String> delete(String username) {
		User user = this.userRepository.findByUsername(username).orElse(null);
		if (user != null) {
			this.userRepository.delete(user);
			return ResponseEntity.ok("User deleted successfully");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@Override
	public ResponseEntity<User> login(String username, String password) throws GlobalExceptionHandler {
		User user = userRepository.findByUsername(username).orElseThrow(() -> new GlobalExceptionHandler("User not found"));

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid credentials");
        }

        return ResponseEntity.ok(user);
	}

	@Override
	public ResponseEntity<String> update(String username, @Valid User user) {
		User existingUser = this.userRepository.findByUsername(username).orElse(null);
		
		if (user != null) {
			if (user.getUsername() != null && !user.getUsername().isBlank()) {
				User alreadyExists = this.userRepository.findByUsername(user.getUsername()).orElse(null);
				if (alreadyExists == null) {
					existingUser.setUsername(user.getUsername());
				} else {
					return ResponseEntity.status(HttpStatus.FOUND).body("Username already exists");
				}
			}
			
			if (user.getPassword() != null && !user.getPassword().isBlank()) {
				existingUser.setPassword(user.getPassword());
			}
			
			this.userRepository.save(existingUser);
			
			return ResponseEntity.ok("User updated successfully!");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
		}
	}
	
}

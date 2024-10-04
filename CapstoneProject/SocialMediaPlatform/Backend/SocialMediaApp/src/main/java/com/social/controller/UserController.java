package com.social.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.dao.User;
import com.social.dto.UserLoginDTO;
import com.social.error.GlobalExceptionHandler;
import com.social.service.UserService;

import jakarta.validation.Valid;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/auth/register")
	public ResponseEntity<User> register(@Valid @RequestBody User user) throws GlobalExceptionHandler {
		System.out.println("Register Controller Called");
		return this.userService.register(user.getUsername(), user.getPassword());
	}
	
	@PostMapping("/auth/login")
	public ResponseEntity<User> login(@RequestBody UserLoginDTO userLoginDTO) throws GlobalExceptionHandler {
		return this.userService.login(userLoginDTO.getUsername(), userLoginDTO.getPassword());
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<User> findByUsername(@PathVariable String username) {
		return this.userService.findByUsername(username);
	}
	
	@PutMapping("/update/{username}")
	public ResponseEntity<String> update(@PathVariable String username, @Valid @RequestBody User user) {
		return this.userService.update(username, user);
	}
	
	@DeleteMapping("/delete/{username}")
	public ResponseEntity<String> delete(@PathVariable String username) {
		return this.userService.delete(username);
	}
	
}

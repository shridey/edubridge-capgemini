package com.social.service;

import org.springframework.http.ResponseEntity;

import com.social.dao.User;
import com.social.error.GlobalExceptionHandler;

import jakarta.validation.Valid;

public interface UserService {

	ResponseEntity<User> register(String username, String password) throws GlobalExceptionHandler;

	ResponseEntity<User> findByUsername(String username);

	ResponseEntity<String> delete(String username);

	ResponseEntity<User> login(String username, String password) throws GlobalExceptionHandler;

	ResponseEntity<String> update(String username, @Valid User user);

}

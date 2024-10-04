package com.social.service;

import org.springframework.http.ResponseEntity;

import com.social.dao.Profile;
import com.social.error.GlobalExceptionHandler;

public interface ProfileService {

	ResponseEntity<Profile> findByUserUsername(String username);

	ResponseEntity<Profile> update(String username, Profile profile) throws GlobalExceptionHandler;

}

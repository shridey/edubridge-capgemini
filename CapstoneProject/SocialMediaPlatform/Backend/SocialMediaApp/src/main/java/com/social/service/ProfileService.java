package com.social.service;

import org.springframework.http.ResponseEntity;

import com.social.dao.Profile;

public interface ProfileService {

	ResponseEntity<Profile> findByUserUsername(String username);

	ResponseEntity<Profile> update(String username, Profile profile);

}

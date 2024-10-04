package com.social.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.dao.Profile;
import com.social.error.GlobalExceptionHandler;
import com.social.service.ProfileService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/{username}")
	public ResponseEntity<Profile> findByUserUsername(@PathVariable String username) {
		return this.profileService.findByUserUsername(username);
	}
	
	@PutMapping("/update/{username}")
	public ResponseEntity<Profile> update(@PathVariable String username, @RequestBody Profile profile) throws GlobalExceptionHandler {
		System.out.println(profile.toString());
		return this.profileService.update(username, profile);
	}
	
}

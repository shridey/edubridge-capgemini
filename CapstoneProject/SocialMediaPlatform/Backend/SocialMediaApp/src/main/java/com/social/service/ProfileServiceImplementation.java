package com.social.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.social.dao.Profile;
import com.social.repository.ProfileRepository;

@Service
public class ProfileServiceImplementation implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public ResponseEntity<Profile> findByUserUsername(String username) {
		Profile profile = this.profileRepository.findByUserUsername(username).orElse(null);
		
		if (profile != null) {
			return ResponseEntity.ok(profile);
		} else {
			return ResponseEntity.status(404).body(null);
		}
	}

	@Override
	public ResponseEntity<Profile> update(String username, Profile profile) {
		Profile existingProfile = this.profileRepository.findByUserUsername(username).orElse(null);
		
		if (profile != null) {
			if (profile.getRealname() != null && !profile.getRealname().isBlank()) {
				existingProfile.setRealname(profile.getRealname());
			}
			
			if (profile.getBio() != null && !profile.getBio().isBlank()) {
				existingProfile.setBio(profile.getBio());
			}
			
			if (profile.getDob() != null) {
				existingProfile.setDob(profile.getDob());
			}
			
			if (profile.getAvatarUrl() != null && !profile.getAvatarUrl().isBlank()) {
				existingProfile.setAvatarUrl(profile.getAvatarUrl());
			}
			
			this.profileRepository.save(existingProfile);
			
			return ResponseEntity.ok(existingProfile);
		} else {
			return ResponseEntity.status(404).body(null);
		}
	}
	
	
	
}

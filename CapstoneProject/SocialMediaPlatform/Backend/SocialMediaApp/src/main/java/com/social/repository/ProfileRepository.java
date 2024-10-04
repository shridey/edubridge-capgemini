package com.social.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.dao.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
	
	Optional<Profile> findByUserUsername(String username);

}

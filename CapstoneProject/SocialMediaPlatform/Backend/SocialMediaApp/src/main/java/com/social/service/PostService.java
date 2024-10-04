package com.social.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.social.dao.Post;
import com.social.dto.PostDTO;
import com.social.error.GlobalExceptionHandler;

public interface PostService {

	ResponseEntity<Post> createPost(String username, Post post) throws GlobalExceptionHandler;

	ResponseEntity<List<Post>> getAllPosts(String username)  throws GlobalExceptionHandler;

	ResponseEntity<List<PostDTO>> getUniversalPosts();

	ResponseEntity<List<PostDTO>> deletePost(Integer postId);

}

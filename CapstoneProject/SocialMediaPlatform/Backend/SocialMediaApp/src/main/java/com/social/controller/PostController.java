package com.social.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.dao.Post;
import com.social.dto.PostDTO;
import com.social.error.GlobalExceptionHandler;
import com.social.service.PostService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/posts")
public class PostController {

	@Autowired
	private PostService postService;
	
	@GetMapping("")
	public ResponseEntity<List<PostDTO>> getUniversalPosts() {
		return this.postService.getUniversalPosts();
	}
	
	@PostMapping("/{username}/addPost")
	public ResponseEntity<Post> createPost(@PathVariable String username, @RequestBody Post post) throws GlobalExceptionHandler {
		return this.postService.createPost(username, post);
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<List<Post>> getAllPosts(@PathVariable String username) throws GlobalExceptionHandler {
		return this.postService.getAllPosts(username);
	}
	
	@DeleteMapping("/{postId}")
	public ResponseEntity<List<PostDTO>> deletePost(@PathVariable Integer postId) {
		return this.postService.deletePost(postId);
	}
	
}

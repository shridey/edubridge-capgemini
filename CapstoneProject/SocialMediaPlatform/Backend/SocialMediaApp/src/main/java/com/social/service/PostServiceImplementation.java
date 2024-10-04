package com.social.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.social.dao.Post;
import com.social.dao.User;
import com.social.dto.PostDTO;
import com.social.error.GlobalExceptionHandler;
import com.social.repository.PostRepository;
import com.social.repository.UserRepository;

@Service
public class PostServiceImplementation implements PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public ResponseEntity<Post> createPost(String username, Post post) throws GlobalExceptionHandler {
		User existingUser = this.userRepository.findByUsername(username).orElse(null);
		
		if (existingUser == null) {
			throw new GlobalExceptionHandler("User not found");
		}
		
		Post newPost = new Post(post.getCaption(), post.getImageUrl(), existingUser);
		
		Post savedPost = this.postRepository.save(newPost);
		return ResponseEntity.ok(savedPost);
	}

	@Override
	public ResponseEntity<List<Post>> getAllPosts(String username) throws GlobalExceptionHandler {
		User existingUser = this.userRepository.findByUsername(username).orElse(null);
		
		if (existingUser == null) {
			throw new GlobalExceptionHandler("User not found");
		}
		
		List<Post> posts = existingUser.getPosts();
		
		return ResponseEntity.ok(posts);
	}

	@Override
	public ResponseEntity<List<PostDTO>> getUniversalPosts() {
		List<Post> posts = this.postRepository.findAll();
		
		List<PostDTO> list = new ArrayList<>();
		
		for (Post post: posts) {
			PostDTO postDto = new PostDTO(post, post.getUser().getUsername());
			list.add(postDto);
		}
		return ResponseEntity.ok(list);
	}

	@Override
	public ResponseEntity<List<PostDTO>> deletePost(Integer postId) {
		Post existingPost = this.postRepository.findById(postId).orElse(null);
		if (existingPost != null) {
			this.postRepository.deleteById(postId);
			List<Post> posts = this.postRepository.findAll();
			
			List<PostDTO> list = new ArrayList<>();
			
			for (Post post: posts) {
				PostDTO postDto = new PostDTO(post, post.getUser().getUsername());
				list.add(postDto);
			}
			return ResponseEntity.ok(list);
		}
		return ResponseEntity.status(404).body(null);
	}
	
	

}

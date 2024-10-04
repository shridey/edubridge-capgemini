package com.social.dto;

import com.social.dao.Post;

public class PostDTO {
	
	private Post post;
	private String username;
	
	public PostDTO(Post post, String username) {
		super();
		this.post = post;
		this.username = username;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

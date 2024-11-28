package com.spring.lab7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean (name = {"message1"})
	public Message getBean() {
		return new Message();
	}
}

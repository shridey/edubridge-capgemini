package com.spring.lab7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Message msg=(Message) context.getBean("message1");
        msg.display();
	}

}

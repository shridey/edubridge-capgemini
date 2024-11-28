package com.spring.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		Student student = new Student();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		Student student = (Student) context.getBean("student");
		student.display();
	}

}

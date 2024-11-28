package com.spring.lab6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Employee.class);
		Employee employee = (Employee) context.getBean("employee");
		employee.display();
	}

}

package com.spring.lab2;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		
		Employee employee1 = (Employee) context.getBean("employee1");
		Employee employee2 = (Employee) context.getBean("employee2");
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter Employee Name: ");
//		employee1.setEmployeeName(sc.nextLine());
//		System.out.print("Enter Employee Salary: ");
//		employee1.setEmployeeSalary(sc.nextFloat());
//		
//		sc.close();
		
		employee1.employeeDisplay();
		employee2.employeeDisplay();
	}

}

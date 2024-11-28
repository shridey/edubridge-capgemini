package com.spring.lab1;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		System.out.println("Student Constructor!");
	}
	
	public Student(String name) {
		System.out.println("Student Constructor with 1 Argument!");
		this.name = name;
	}
	
	public Student(String name, int age) {
		System.out.println("Student Constructor with 1 Argument!");
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Display method: " + name + " | " + age);
	}
}

package com.spring.lab2;

public class Employee {

	private String employeeName;
	private float employeeSalary;
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public void employeeDisplay() {
		System.out.println("Name: " + this.getEmployeeName() + " | " + "Salary: " + this.getEmployeeSalary());
	}
	
}

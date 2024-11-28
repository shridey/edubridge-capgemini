package com.hibernate.employees;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure("myconfig.xml");
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Department.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Department department1 = new Department("IT", "Mumbai"); // Transient State
		
		Employee employee1 = new Employee("Rahul", 30500.0f, "2020-08-21");
		Employee employee2 = new Employee("Sunny", 45500.0f, "2015-05-12");
		Employee employee3 = new Employee("Ashu", 25800.0f, "2022-07-30");
		Employee employee4 = new Employee("Harsh", 20500.0f, "2024-08-09");
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		department1.setEmployeeList(employeeList);
		session.save(department1); // Persistent State
		
		transaction.commit();
		
		session.close(); // Detach State
	}

}

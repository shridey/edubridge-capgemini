package com.hibernate.projects;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Employee.class).addAnnotatedClass(Project.class);
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee1 = new Employee(1, "Shri");
		
		Project project1 = new Project(1, "Student Management");
		Project project2 = new Project(2, "Employee Management");
		Project project3 = new Project(3, "Project Management");
		
		List<Project> projects = new ArrayList<Project>();
		projects.add(project1);
		projects.add(project2);
		projects.add(project3);
		
		employee1.setProjects(projects);
		
		session.save(employee1);
		session.save(project1);
		session.save(project2);
		session.save(project3);
		
		transaction.commit();
		session.close();
	}

}

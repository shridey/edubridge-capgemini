package com.hibernate.students;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Course.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Course course1 = new Course("Core Java", 5000.0f);
		
		Student student1 = new Student("Shri", 22);
		Student student2 = new Student("Deepika", 20);
		Student student3 = new Student("Aarti", 21);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		course1.setStudents(students);
		
		session.save(course1);
		
		transaction.commit();
		session.close();
	}

}

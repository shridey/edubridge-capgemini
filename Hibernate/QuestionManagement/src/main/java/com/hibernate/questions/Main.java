package com.hibernate.questions;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Question question = new Question("What is your Trainer's name?");
//		Answer answer = new Answer("Indrakka Mam");
//		
//		question.setAnswer(answer);
//		
//		session.save(question);
//		session.save(answer);
//		
//		transaction.commit();
		
		Query q=session.createQuery("update Question set question=:q where id=:i");  
		q.setParameter("q","Who is the trainer?");  
		q.setParameter("i",1);  
		  
		int status=q.executeUpdate();  
		System.out.println(status); 
		
		transaction.commit();
		
		session.close();
	}

}

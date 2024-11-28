package learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		// Step 1: Configuring the Hibernate
		
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Product.class);
		
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Product.class);
		
		// Step 2: Building the Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		// Step 3: Opening a Session
		Session session = sessionFactory.openSession();
		
		// Step 4: Beginning a Transaction
		Transaction transaction = session.beginTransaction();
		
		Product product = new Product("Mac", 120000.0f);
		
		System.out.println("Product Object Before Persistence: " + product);
		
		// Saving the object into database;
		session.persist(product); // Earlier it was session.save(Object)
		
		System.out.println("Product Object After Persistence: " + session.get(Product.class, 1));
		
		// Step 5: Committing a Transaction
		transaction.commit();
		
		// Step 6: Closing a Session, automatically ends the Transaction
		session.close();
	}
	
}

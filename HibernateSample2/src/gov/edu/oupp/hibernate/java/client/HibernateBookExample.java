package gov.edu.oupp.hibernate.java.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import gov.edu.oupp.hibernate.java.entity.Book;

public class HibernateBookExample {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.buildSessionFactory();
		
		//create new book entity
		Book newBook = new Book("Hibernate save");
		
//	    //demonstrate save()
		saveExample(sessionFactory, newBook);
				
//	    //demonstrate persist()
//		persistExample(sessionFactory, newBook);
		

		
//		//demonstrate saveOrUpdate()
		saveOrUpdateExample(sessionFactory, newBook);
		
		//close the session factory
		//sessionFactory.close();
		
	}
	
	private static void persistExample(SessionFactory sessionFactory, Book newBook) {

		try(Session session = sessionFactory.openSession()){
			//begin transaction
			Transaction transaction  = session.beginTransaction();
			
			//using persist
			session.persist(newBook);
			
			//commit transaction
			transaction.commit();
			
//			System.out.println("Book Saved with ID(using save): "+savedBookId);
		}
		
	}

	private static void saveOrUpdateExample(SessionFactory sessionFactory, Book newBook) {

		try(Session session = sessionFactory.openSession()){
			//begin transaction
			Transaction transaction  = session.beginTransaction();
			
			//using saveOrUpdateExample
			session.saveOrUpdate(newBook);
			
			//commit transaction
			transaction.commit();
			
//			System.out.println("Book Saved with ID(using save): "+savedBookId);
		}
		
	}


	private static void saveExample(SessionFactory sessionFactory, Book newBook) {

		try(Session session = sessionFactory.openSession()){
			//begin transaction
			Transaction transaction  = session.beginTransaction();
			
			//using save
			Long savedBookId = (Long) session.save(newBook);
			
			//commit transaction
			transaction.commit();
			
			System.out.println("Book Saved with ID(using save): "+savedBookId);
		}
		
	}
	


}

package gov.edu.oupp.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author Asish Kumar Gouda
 *
 */



public class Main {
	
	public static void main(String[] args) {
		
		//USING SESSION FACTORY
		
		System.out.println("Application Started....");
		
		//configuration of hibernate
		System.out.println("Configure with hibrenate.cfg.xml file");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//build a session factory
		System.out.println("Creating session factory...");
		SessionFactory factory = cfg.buildSessionFactory();
		
		System.out.println("Enter data for insert into People table");
		
		PeopleGrossSalary gross = new PeopleGrossSalary();
		gross.setDa(10300);
		gross.setHra(50000);
		gross.setIncrement(2000);
		
		People people = new People();
		people.setId(10002);
		people.setName("People2Name");
		people.setSalary(gross);
		
		System.out.println("People: "+people);
		
		//open a session
		System.out.println("Open a session");
		Session session = factory.openSession();
		
		//Begin a transaction
		System.out.println("Start a transaction ...");
		Transaction t = session.beginTransaction();
		
		//save the session on which people data is set
		//persist the object
		session.save(people);
		System.out.println("transaction completed.");
		System.out.println("save the session object...");
		
		//commit transaction
		t.commit();
		System.out.println("transaction committed");
		
		//close session factory
		factory.close();
		System.out.println("session factory closed.");
		
		//close session
		session.close();
		System.out.println("session closed...");
		
		
		
		
		
	}

}

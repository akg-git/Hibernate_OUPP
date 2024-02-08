/**
 * 
 */
package gov.edu.oupp.hibernate.java.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import gov.edu.oupp.hibernate.java.entity.Employee;

/**
 * @author Asish Kumar Gouda
 *
 */
public class StoreData {

	static StandardServiceRegistry ssr = 
			new StandardServiceRegistryBuilder()
			.configure("/gov/edu/oupp/hibernate/java/configuration/hibernate.cfg.xml").build();
	static Metadata meta = 
			new MetadataSources(ssr)
			.getMetadataBuilder()
			.build();
	
	private static SessionFactory factory;
	
	
	public static void main(String[] args) {
		
		//get session factory builder
		factory = meta.getSessionFactoryBuilder().build();
		
		//create session
		Session session = factory.openSession();
		
		//transaction started
		System.out.println("BEGIN TRANSACTION...");
		Transaction t = session.beginTransaction();
		
		//persistent object
		Employee e = new Employee();
		e.setFirstName("Initials. FIrst");
		e.setLastName("Middle Name");
		e.setSalary(233000);
		
		//save the session
		session.save(e);
		//commit transaction
		t.commit();
		System.out.println("END TRANSACTION");
		
		//close the factory
		factory.close();
		//close the session
		session.close();

	}

}

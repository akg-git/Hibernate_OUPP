package edu.oupp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import edu.oupp.entity.ContractEmployee;
import edu.oupp.entity.Employee;
import edu.oupp.entity.RegularEmployee;

public class StoreTest {
	
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Gaurav Chawla");
	
		RegularEmployee re = new RegularEmployee();
		re.setName("Vivek Kumar");
		re.setSalary(500000);
		re.setBonus(15000);
		
		ContractEmployee ce = new ContractEmployee();
		ce.setName("Arjun Kumar");
		ce.setPay_per_hour(1500);
		ce.setContract_duration("30 hours");
		
		session.persist(e1);
		session.persist(re);
		session.persist(ce);
		
		transaction.commit();
		session.close();
		System.out.println("Transaction Successful.");
		
	}

}

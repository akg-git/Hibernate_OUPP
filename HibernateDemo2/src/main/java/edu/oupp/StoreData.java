package edu.oupp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {
	
	static StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("/edu/oupp/hibernate.cfg.xml").build();
	static Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		
		factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Experiment exp1 = new Experiment(1, "exp1", "abcd");
		session.save(exp1);
		Experiment exp2 = new Experiment(4, "exp4", "abcde");
		session.save(exp2);
		
		t.commit();
		session.close();
		factory.close();
	}
}

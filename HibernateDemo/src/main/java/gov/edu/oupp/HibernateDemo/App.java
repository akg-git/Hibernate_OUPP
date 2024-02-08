package gov.edu.oupp.HibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienClass ac = new AlienClass();
    	ac.setAid(10);
    	ac.setAname("alien025t");
    	ac.setTech("python");
        
    	//USING ENTITY MANAGER FACTORY
    	//entity manager factory
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("emf");
    	//entity manager
    	EntityManager emgr = emf.createEntityManager();
    	//entity transaction
    	EntityTransaction eTrans = emgr.getTransaction();
    	eTrans.begin();
    	
    	//persist entity
    	emgr.persist(ac);
    	
    	
    	
    	//commit transaction
    	emgr.getTransaction().commit();
    	
    	System.out.println(emgr);
    	
    	//close
    	emgr.close();
    	emf.close();
    }
}

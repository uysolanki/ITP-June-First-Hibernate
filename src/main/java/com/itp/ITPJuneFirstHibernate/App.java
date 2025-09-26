package com.itp.ITPJuneFirstHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPJuneFirstHibernate.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	System.out.println(factory.isClosed());
    	
    	Session session=factory.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	Student s1=new Student(63,"Surya",78.5);   //object
    	session.save(s1);
    	tx.commit();
    	System.out.println("record inserted");
    	
    	session.close();
    	factory.close();

    }
}

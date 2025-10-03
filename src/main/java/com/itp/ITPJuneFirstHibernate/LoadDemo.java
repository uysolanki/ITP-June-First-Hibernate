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
public class LoadDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	System.out.println(factory.isClosed());
    	
    	Session session=factory.openSession();
    	
    	Student s1=session.load(Student.class, 1);		//proxy rno : 5 , sname : null, per 0.0	
   
    	
    	System.out.println("Hi!!!!");
    	System.out.println(s1.getRno());
    	
    	System.out.println("Bye!!!!");
    	
    	System.out.println(s1.getSname());		//query select
    											//Surya
    
    	Student s2=session.load(Student.class, 1);
    	System.out.println(s2.getSname());
    	session.close();
    	factory.close();

    }
}

//Create - save()
//Read
//U
//D

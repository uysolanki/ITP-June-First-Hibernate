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
public class SecondLevelCacheDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	System.out.println(factory.isClosed());
    	
    	Session session=factory.openSession();
    	Session session1=factory.openSession();
    	
    	Student s1=session.get(Student.class, 1);  //query yes
    	System.out.println(s1);
    	
    	System.out.println("Hi!!!!");
    	
    	Student s2=session1.get(Student.class, 1);	//query yes
    	System.out.println(s2);
    	
    	
    	System.out.println(s1==s2);
    	session.close();
    	factory.close();

    }
}

//Create - save()
//Read
//U
//D

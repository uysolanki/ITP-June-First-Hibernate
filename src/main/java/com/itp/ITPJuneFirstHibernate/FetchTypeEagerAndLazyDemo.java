package com.itp.ITPJuneFirstHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.itp.ITPJuneFirstHibernate.model.Dept;
import com.itp.ITPJuneFirstHibernate.model.Employee;

/**
 * Hello world!
 *
 */
public class FetchTypeEagerAndLazyDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	
//    	State myState=session.load(State.class,1); //no query
//    	
//    	System.out.println(myState.getSname());
//    	
//    	System.out.println("HIII");
//    	
//    	System.out.println(myState.getChiefMinister().getCmname());
    	
    	Dept myDept=session.get(Dept.class,1);
    	for(Employee employee:myDept.getEmployees())
    	{
    		System.out.println(employee.getEname());
    	}
    	System.out.println();
    	session.close();
    	factory.close();

    }
}

//Create - save()
//Read
//U
//D

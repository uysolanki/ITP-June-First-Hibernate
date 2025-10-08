package com.itp.ITPJuneFirstHibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;

import com.itp.ITPJuneFirstHibernate.model.Student;

public class HQLDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	
    	Session session=factory.openSession();
    	
//    	Query q1=session.createQuery("From Student");
//		List<Student> students=q1.list();
//		System.out.println(students);
    	
//    	Query q1=session.createQuery("From Student where rno=2");
//		q1.setCacheable(true);
//		Student s1=(Student)q1.uniqueResult();
//		System.out.println(s1);


//		Query q1=session.createQuery("From Student where rno= :x");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Rno");
//		int rn=sc.nextInt();
//		q1.setParameter("x",rn);
//		Student s1=(Student)q1.uniqueResult();
//		System.out.println(s1);
    	
    	
//    	Query q1=session.createQuery("select rno,sname from Student");
//		
//    	List<Object[]> students=(List<Object[]>)q1.list();
//		for(Object[] student:students)
//				{
//					System.out.println(student[0] + "" +student[1]);
//				}

    	
//    	Query q1=session.createQuery("select sum(per) from Student s where s.per>=40");
//		double ans=(double)q1.uniqueResult();
//		System.out.println(ans);
    	
    	
    	
    	SQLQuery query=session.createSQLQuery("select * from student s where s.per>=60 order by per desc");
		query.addEntity(Student.class);
		List<Student> students=query.list();
		System.out.println(students);


//    	SQLQuery query = session.createSQLQuery("select * from student where per >= 60");
//    	query.addEntity(Student.class);
//    	List<Student> students = query.list();
//
//    	for (Student s : students) {
//    	    System.out.println(s.getRno() + " " + s.getSname());
//    	}




	}

}

package com.tap;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.tap.Models.*;
public class Hibernet1 {

	public static void main(String[] args) {
		
		
		Configuration config = new Configuration();
	    config.configure();
	    config.addAnnotatedClass(Student.class);
	    SessionFactory sessionFactory  = config.buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    
	    Student s1 = new Student(2,"krish","krish@gmail.com","IT",80);
	    session.save(s1);
	    transaction.commit();
	    
	    
		System.out.println(config);
		
	}

}

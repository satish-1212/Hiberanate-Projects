package com.tap;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.tap.Models.*;


	public class Program2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Student s =session.get(Student.class, 25);    //Here we use get method for retrive the single  row
			
			System.out.println(s);
			
			
			transaction.commit();

		}

	

	
	

	}



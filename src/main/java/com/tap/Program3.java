package com.tap;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
//import org.hibernate.Session.Query;
import com.tap.Models.*;
import java.util.List;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub
				SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
						.buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				
				Query query = session.createQuery("from Student");   //Her we get retrive the multiple rows..
				List students =query.getResultList();
				for(Object s : students)
				{
					System.out.println(s);
				}
				
				
				
				transaction.commit();

			}

		


	}


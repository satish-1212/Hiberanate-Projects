package com.tap;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.tap.Models.*;

public class Delete2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "delete from Student s where s.percentage=60";
		Query query = session.createQuery(hql);
		int i = query.executeUpdate();
		System.out.println(i);
		
		
		
		
		//transaction.commit();

	}

}

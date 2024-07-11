
package com.tap;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.tap.Models.*;

public class Update {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				SessionFactory sessionFactory = new Configuration()
						                         .configure()
						                        .addAnnotatedClass(Student.class)
						                         .buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				 Student s =session.get(Student.class, 1);
				 s.setPercentage(90);
				 s.setName("satish");
				 session.update(s);
				//System.out.print(s);
				
				

			}

		


	}



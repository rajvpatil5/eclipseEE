package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class GetInstructorDelails {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// create session
		Session session = factory.openSession();

		try {
			// start a transaction
			session.beginTransaction();
			
			// get instructor by primary key / id
			int theId = 29;
			InstructorDetails tempInstructor = session.get(InstructorDetails.class, theId);
			System.out.println("Found instructor: " + tempInstructor.getInstructor().getName());

			//you have to break by directional mapping to delete only one object, else you will get error and also change cascade type
			tempInstructor.getInstructor().setInstructorDetailsId(null);
			
			// delete
			session.delete(tempInstructor);
			
			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
		/*
		 * Query createQuery =
		 * openSession.createQuery("delete from Instructor where instructor_id=12");
		 * openSession.beginTransaction(); int executeUpdate =
		 * createQuery.executeUpdate(); openSession.getTransaction().commit();
		 * openSession.close(); System.out.println("Delete"+executeUpdate);
		 * 
		 * Query createQuery =
		 * openSession.createQuery("delete from Student where student_id=22");
		 * openSession.beginTransaction(); int executeUpdate =
		 * createQuery.executeUpdate(); openSession.getTransaction().commit();
		 * openSession.close(); System.out.println("Delete"+executeUpdate);
		 */

	}

}

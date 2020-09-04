package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class InstructorDelete {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// create session
		Session session = factory.openSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get instructor by primary key / id
			int theId = 22;
			Instructor tempInstructor = session.load(Instructor.class, theId);

			System.out.println("Found instructor: " + tempInstructor);

			// delete the instructors
			if (tempInstructor != null) {

				System.out.println("Deleting: " + tempInstructor);

				// Note: will ALSO delete associated "details" object
				// because of CascadeType.ALL
				//
				session.delete(tempInstructor);
			}
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

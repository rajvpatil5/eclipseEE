package com.manyTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class DeleteProject {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// create session
		Session session = factory.openSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get the pacman course from db
			int courseId = 22;
			Employee tempCourse = session.get(Employee.class, courseId);

			// delete the course
			System.out.println("Deleting course: " + tempCourse);

			session.delete(tempCourse);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			// add clean up code
			session.close();

			factory.close();
		}
	}

}

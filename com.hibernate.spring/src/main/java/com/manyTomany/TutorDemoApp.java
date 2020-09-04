package com.manyTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TutorDemoApp {

	public static void main(String[] args) {
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();

		
		Tutor tutor = new Tutor();
		tutor.setName("Rajat");
		tutor.setEmail("Rajvpatil@gmail.com");
		
		Course course = new Course();
		course.setTitle("Java");
		course.add(null);
		Course course1 = new Course();
		course1.setTitle("python");
		course1.add(null);
		//to delete course
//		Course course = openSession.get(Course.class, 35);
//		openSession.delete(course);
		
		tutor.add(course);
		tutor.add(course1);
		
		openSession.beginTransaction();
		openSession.save(tutor);

		
		openSession.getTransaction().commit();
		openSession.close();
		
		System.out.println("Done");

	}

}

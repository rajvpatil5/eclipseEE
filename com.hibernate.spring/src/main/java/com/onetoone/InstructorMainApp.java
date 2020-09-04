package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InstructorMainApp {

	public static void main(String[] args) {
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		
		InstructorDetails instructorDetails = new InstructorDetails();
		instructorDetails.setHobbies("Coding2");
		instructorDetails.setYoutubeChannel("Alpha2");
		
		Instructor instructor = new Instructor();
		instructor.setName("Rajat Patil");
		instructor.setEmail("rajat.patil@gmail.com");
		instructor.setInstructorDetailsId(instructorDetails);
		
		Session openSession = buildSessionFactory.openSession();
		openSession.beginTransaction();
		openSession.save(instructor);
		
		openSession.getTransaction().commit();
		openSession.close();
		
		System.out.println("Done");
	}
}

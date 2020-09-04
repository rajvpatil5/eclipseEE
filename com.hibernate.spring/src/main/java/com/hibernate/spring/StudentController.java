package com.hibernate.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentController {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		
		//create student object to set values in student database
		Student student = new Student();
		student.setAddress("gajanan nagar");
		student.setCity("Dellas");
		student.setCountry("USA");
		student.setDemo("demo");
		student.setSubject("History");
		student.setStream("BE");
		
		Session session = sessionfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
		System.out.println("Done...");
	}

}

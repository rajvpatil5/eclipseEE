package com.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TeacherDemoApp {

	public static void main(String[] args) {
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		
		TeacherDetails teacherDetails = new TeacherDetails();
		teacherDetails.setHobbies("Singing");
		teacherDetails.setYoutubeChannel("Jfla");
		
		Teacher teacher = new Teacher();
		teacher.setName("Jfla Didi");
		teacher.setEmail("jfla@gmail.com");
		teacher.setTeacherDetails(teacherDetails);
		
		openSession.beginTransaction();
		openSession.save(teacher);
		openSession.getTransaction().commit();
		openSession.close();
		System.out.println("Done");
	}

}

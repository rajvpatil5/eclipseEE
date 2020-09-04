package com.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FeedbackDemoApp {

	public static void main(String[] args) {
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		
		Lesson lesson = openSession.get(Lesson.class, 19);
	
		
		
		Feedback feedback = new Feedback();
		feedback.setComment("Very good course");
		feedback.setLesson(lesson);
		
		Feedback feedback1 = new Feedback();
		feedback1.setComment("dumb Lesson's");
		feedback1.setLesson(lesson);
		Feedback feedback2 = new Feedback();
		feedback2.setComment("awesome");
		feedback2.setLesson(lesson);
		
		lesson.add(feedback);
		lesson.add(feedback1);
		lesson.add(feedback2);

		openSession.beginTransaction();
		openSession.save(feedback);
		openSession.save(feedback1);
		openSession.save(feedback2);
		openSession.getTransaction().commit();
		openSession.close();
		System.out.println("Done");

	}

}

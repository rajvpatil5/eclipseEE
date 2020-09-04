package com.query;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LessonDemoApp {

	public static void main(String[] args) {
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();

		Teacher teacher = openSession.get(Teacher.class, 5);

		Lesson lesson = new Lesson();
		lesson.setTitle("Docker");
		lesson.setTeacher(teacher);
		
		Lesson lesson1 = new Lesson();
		lesson1.setTitle("Python with kubernet");
		lesson1.setTeacher(teacher);

		teacher.add(lesson);
		teacher.add(lesson1);

		openSession.beginTransaction();
		openSession.save(lesson);
		openSession.save(lesson1);
		openSession.getTransaction().commit();
		openSession.close();
		System.out.println("Done");

	}

}

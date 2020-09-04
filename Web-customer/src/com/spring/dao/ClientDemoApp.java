package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.entity.Client;

public class ClientDemoApp {

	public static void main(String[] args) {
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();

		Client client = new Client();
		client.setFirstName("Arjun");
		client.setLastName("Pal");
		client.setEmail("arjunpal@gmail.com");

		openSession.beginTransaction();
		openSession.save(client);
		openSession.getTransaction().commit();
		openSession.close();
		System.out.println("Done...");
	}

}

package com.onetoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionfactory = configuration.buildSessionFactory();

		Cars car = new Cars();
		car.setCarName("General Motars");
		
		Country country = new Country();
		country.setCountryId(1);
		country.setCountryName("Italy");
		country.setCar(car);
		Country country1 = new Country();
		country1.setCountryId(2);
		country1.setCountryName("France");
		country1.setCar(car);
		Country country2 = new Country();
		country2.setCountryId(3);
		country2.setCountryName("India");
		country2.setCar(car);
			
		List <Country> c = new ArrayList<Country>();
		c.add(country);
		c.add(country1);
		c.add(country2);
		
		
		car.setCountry(c);
		
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(car);
		session.save(country);
		session.save(country1);
		session.save(country2);
		transaction.commit();
		session.close();
		System.out.println("Done...");
	}

}

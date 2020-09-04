package com.hibernate.spring;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BajajController {

	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Dmart dmart = new Dmart();
		dmart.setName("Dmart");
		dmart.setPrice(2210);
		
		Bajaj bajaj = new Bajaj();
		//passing dmart object to bajaj
		bajaj.setDmart(dmart);
		
		bajaj.setBid(1);
		bajaj.setFinance("No 1 multibaggar");
		bajaj.setFinserve("No 1 NBFC");
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		session.save(bajaj);
		transaction.commit();
		session.close();
		System.out.println("Data Inserted...");
	}

}

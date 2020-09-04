package com.hibernate.spring;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoHibernate {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        SessionFactory sf = conf.buildSessionFactory();
        System.out.println(sf);
        System.out.println(sf.isClosed());
        
    }

}

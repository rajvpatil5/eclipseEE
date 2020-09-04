package com.onlybyjavacode.withdependencyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SportsCarApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Sportscar.class);

		BMW car = context.getBean("BMW", BMW.class);
		
		System.out.println(car.doors());
		System.out.println(car.musicSystem());
		System.out.println(car.metal());
		System.out.println(car.tyres());
		
		System.out.println(car.getName());
		System.out.println(car.getTime());
		System.out.println(car.getTrackInKM());
	}

}

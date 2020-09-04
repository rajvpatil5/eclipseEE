package com.onlybyjavacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SportsCarApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Sportscar.class);

		Car car = context.getBean("BMW", Car.class);
		
		System.out.println(car.doors());
		System.out.println(car.musicSystem());
		System.out.println(car.metal());
		System.out.println(car.tyres());
	}

}

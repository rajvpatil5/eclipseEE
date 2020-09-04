package com.annotation.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		// for TennisCoach - constructor injection
		//Coach thecoach = context.getBean("myCoachWorkout" , Coach.class);

		// for FootballCoach - Setter method injection
		// Coach thecoach = context.getBean("footballCoach" , Coach.class);

		// for BadmintonCoach - Field injection
		Coach thecoach = context.getBean("badmintonCoach", Coach.class);

		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		
		
		
		
//		type Scope is Prototype
//		Coach thecoach1 = context.getBean("badmintonCoach", Coach.class);
//		System.out.println(thecoach==thecoach1);
		
		
		
		
		context.close();
	}

}

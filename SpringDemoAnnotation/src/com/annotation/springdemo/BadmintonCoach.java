package com.annotation.springdemo;

import javax.annotation.PostConstruct;

/*Example for Field injection*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BadmintonCoach implements Coach {
	
	@Autowired
	@Qualifier("ratandeepFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Do net practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
//	@PostConstruct
//	public void m1(String g)
//	{
//		System.out.println("postconstruct");
//	this method should be no args
//	}

}

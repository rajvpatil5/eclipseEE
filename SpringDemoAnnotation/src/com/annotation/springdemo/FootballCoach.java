package com.annotation.springdemo;

/*Example for Setter method injection*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	private FortuneService fortuneService;
	

	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "goal practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

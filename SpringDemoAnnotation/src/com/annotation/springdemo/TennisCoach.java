package com.annotation.springdemo;

/*Example for Constructor injection*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myCoachWorkout")
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("ratandeepFortuneService")FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Daily back hand practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

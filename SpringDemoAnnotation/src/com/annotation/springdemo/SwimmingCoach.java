package com.annotation.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimmingCoach implements Coach {

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;
	private FortuneService fortuneService;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimmingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Deep Dive and 1000m swim as a workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

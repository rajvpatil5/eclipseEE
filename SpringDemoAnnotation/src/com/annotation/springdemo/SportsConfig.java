package com.annotation.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.annotation.springdemo")
@PropertySource("classpath:sport.properties")
public class SportsConfig {
	@Bean
	public FortuneService baburaoService() {
		return new BaburaoFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimmingCoach(baburaoService());
	}
}

package com.annotation.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RatandeepFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RatandeepFortuneService";
	}

}

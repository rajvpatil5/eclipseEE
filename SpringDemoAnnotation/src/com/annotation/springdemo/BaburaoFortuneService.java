package com.annotation.springdemo;

public class BaburaoFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Lucky day to win lottary - baburao fortune service";
	}

}

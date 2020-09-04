package com.onlybyjavacode;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Car {

	@Override
	public String tyres() {
		return "bmw CEAT tyres";
	}

	@Override
	public String metal() {
		return "bmw Iron chassi";
	}

	@Override
	public String musicSystem() {
		return "bmw sony music system";
	}

	@Override
	public String doors() {
		return "bmw regular doors";
	}

}

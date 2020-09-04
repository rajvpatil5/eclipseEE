package com.onlybyjavacode.withdependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Audi implements Car {

	@Override
	public String tyres() {
		return "audi CEAT tyres";
	}

	@Override
	public String metal() {
		return "audi Iron chassi";
	}

	@Override
	public String musicSystem() {
		return "audi sony music system";
	}

	@Override
	public String doors() {
		return "audi regular doors";
	}

}

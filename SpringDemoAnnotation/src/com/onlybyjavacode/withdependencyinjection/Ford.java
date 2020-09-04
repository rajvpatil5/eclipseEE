package com.onlybyjavacode.withdependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Ford implements Car {

	@Override
	public String tyres() {
		return "Ford CEAT tyres";
	}

	@Override
	public String metal() {
		return "Ford Iron chassi";
	}

	@Override
	public String musicSystem() {
		return "sony music system";
	}

	@Override
	public String doors() {
		return "regular doors";
	}

}

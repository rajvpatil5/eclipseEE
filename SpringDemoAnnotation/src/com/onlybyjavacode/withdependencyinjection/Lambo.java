package com.onlybyjavacode.withdependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Lambo implements Car {

	@Override
	public String tyres() {
		return "Lambo mrf tyres";
	}

	@Override
	public String metal() {
		return "lambo aluminium chassi";
	}

	@Override
	public String musicSystem() {
		return "Lambo boat music system";
	}

	@Override
	public String doors() {
		return "lambo sessior doors";
	}

}

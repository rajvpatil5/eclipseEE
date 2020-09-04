package com.onlybyjavacode.withdependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Car {
	private Race race;
	
	public BMW(Race race) {
		this.race=race;
	}

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
	 
	public String getName() {
		return race.name();
	}
	public String getTrackInKM() {
		return race.trackInKM();
	}
	public String getTime() {
		return race.time();
	}

}

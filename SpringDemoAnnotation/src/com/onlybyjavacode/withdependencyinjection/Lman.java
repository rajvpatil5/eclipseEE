package com.onlybyjavacode.withdependencyinjection;

public class Lman implements Race {

	@Override
	public String name() {
		return "Lman race";
	}

	@Override
	public String trackInKM() {
		return "500 KM";
	}

	@Override
	public String time() {
		return "24 hrs";
	}

}

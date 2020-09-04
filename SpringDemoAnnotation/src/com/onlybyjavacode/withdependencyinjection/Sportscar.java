package com.onlybyjavacode.withdependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.annotation.javacode")
public class Sportscar {

	@Bean
	public Race lman() {
		return new Lman();
	}
	@Bean
	public BMW BMW()
	{
		return new BMW(lman());
	}
}

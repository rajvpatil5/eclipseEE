package com.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ZDemologinApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(ZDemologinApplication.class);
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(ZDemologinApplication.class, args);
	}

}

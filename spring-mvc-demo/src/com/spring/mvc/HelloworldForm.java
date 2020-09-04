package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldForm {
	
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld";
	}
	@RequestMapping("/processform")
	public String processForm() {
		return "helloworld-process-form";
	}

}

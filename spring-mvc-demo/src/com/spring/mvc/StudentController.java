package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showform")
	public String showForm(Model themodel) {
		// create student object
		Student thestudent = new Student();

		// add student object to the model
		themodel.addAttribute(thestudent);

		return "student-form";
	}

	// adding process method
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student thestudent) {
		return "student-confirmation";
	}
}

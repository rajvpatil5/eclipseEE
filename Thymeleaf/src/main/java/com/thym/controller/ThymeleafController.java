package com.thym.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thym.entity.Employee;

@Controller
public class ThymeleafController {

	@GetMapping("/hello")
	public String getData(Model theModel) {
		Employee employee = new Employee("Rajat", "Patil", "rajatpatil@gmail.com");
		Employee employee1 = new Employee("Rohan", "Das", "rohandas@gmail.com");
		Employee employee2 = new Employee("Babu", "Chapri", "babuchapri@gmail.com");

		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(employee);
		emplist.add(employee1);
		emplist.add(employee2);

		theModel.addAttribute("empModel", emplist);

		return "Helloworld";
	}

}

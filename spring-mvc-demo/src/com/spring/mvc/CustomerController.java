package com.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/showform")
	public String showForm(Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("customer" , customer);
		return "customer-form";
	}
	@RequestMapping("/processform")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult ) {
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		else {			
		return "customer-process-form";
		}
	}
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		StringTrimmerEditor stringTrimmerEdittor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, stringTrimmerEdittor);
	}

}

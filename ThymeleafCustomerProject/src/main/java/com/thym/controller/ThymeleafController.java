package com.thym.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thym.entity.Client;
import com.thym.service.ClientServiceImpl;

@Controller
@RequestMapping("/client")
public class ThymeleafController {

	@Autowired
	private ClientServiceImpl clientServiceImpl;

	@GetMapping("/list")
	public String getData(Model theModel) {
		List<Client> emplist = clientServiceImpl.findAll();
		theModel.addAttribute("emplist", emplist);
		return "Helloworld";
	}

	@GetMapping("/showform")
	public String showFormAdd(Model theModel) {
		Client client = new Client();
		theModel.addAttribute("client",client);
		return "entryform";
	}
	
	@PostMapping("/save")
	public String saveClient(@ModelAttribute("client") Client client) {
		clientServiceImpl.save(client);
		return "redirect:/client/list";
	}
	
	@GetMapping("/showformforupdate")
	public String showFormForUpdate(@RequestParam("clientId") int theId, Model theModel) {
		Client theClient = clientServiceImpl.findById(theId);
		theModel.addAttribute("client", theClient);
		return "entryform";
	}
	
	@GetMapping("/delete")
	public String deleteClient(@RequestParam("clientId") int theId){
		clientServiceImpl.deleteById(theId);
		return "redirect:/client/list";
		
	}
}

































































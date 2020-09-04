package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.entity.Client;
import com.spring.service.ClientService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ClientService clientService;

	@RequestMapping("/list")
	public String listCustomer(Model theModel) {
		List<Client> client = clientService.getClient();
		theModel.addAttribute("client", client);
		return "list-customer";
	}

	@GetMapping("/showform")
	public String showFormAdd(Model theModel) {
		Client client = new Client();
		theModel.addAttribute(client);
		return "entryform";
	}

	@PostMapping("/saveclient")
	public String saveClient(@ModelAttribute("client") Client theClient) {
		clientService.saveClient(theClient);

		return "redirect:/customer/list";
	}

	@GetMapping("/showformforupdate")
	public String showFormForUpdate(@RequestParam("clientId") int theId, Model theModel) {
		Client theClient = clientService.getCustomer(theId);
		theModel.addAttribute("client", theClient);
		return "entryform";
	}

	@GetMapping("/delete")
	public String deleteClient(@RequestParam("clientId") int theId) {
		clientService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}

}
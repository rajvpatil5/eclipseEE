package com.crud.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.rest.dao.ClientDAO;
import com.crud.rest.entity.Client;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/apijpa")
public class RestController {
	@Autowired
	private ClientDAO clientDAO;

	@GetMapping("/client")
	public List<Client> getClient() {
		return clientDAO.findAll();

	}

	@GetMapping("/client/{clientId}")
	public Client getClient(@PathVariable int clientId) {
		Client client = clientDAO.findById(clientId);
		if (client == null) {
			throw new RuntimeException("Client Id not found" + clientId);
		}
		return client;

	}

	@PostMapping("/client")
	public Client save(@RequestBody Client client) {
		client.setId(0);
		clientDAO.save(client);
		return client;

	}

	@PutMapping("/client")
	public Client updateClient(@RequestBody Client client) {
		clientDAO.save(client);
		return client;
	}

	@DeleteMapping("client/{clientId}")
	public String deleteClient(@PathVariable int clientId) {
		Client client = clientDAO.findById(clientId);
		if (client == null) {
			throw new RuntimeException("Client Id not found" + clientId);
		}
		clientDAO.delete(clientId);

		return "Deleted Client id " + clientId;
	}
}

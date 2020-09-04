package com.thym.service;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thym.dao.ClientDAO;
import com.thym.entity.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO clientDAO;

	@Transactional
	@Override
	public List<Client> findAll() {
		return clientDAO.findAll();
	}

	@Override
	public Client findById(int theId) {
		Optional<Client> result = clientDAO.findById(theId);
		Client theClient = null;

		if (result.isPresent()) {
			theClient = result.get();
		} else {
			throw new RuntimeException("Client Id not found" + theId);
		}
		return theClient;
	}

	@Override
	public void save(Client theClient) {
		clientDAO.save(theClient);

	}

	@Override
	public void deleteById(int theId) {
		Optional<Client> result = clientDAO.findById(theId);
		if (result.isPresent()) {
			clientDAO.deleteById(theId);
		} else {
			throw new RuntimeException("Client Id not found" + theId);
		}
	}

}

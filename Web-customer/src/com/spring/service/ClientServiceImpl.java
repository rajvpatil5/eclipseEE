package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ClientDAO;
import com.spring.dao.ClientDAOImpl;
import com.spring.entity.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO clientDAO;

	@Transactional
	@Override
	public List<Client> getClient() {
		return clientDAO.getClient();
	}

	@Transactional
	@Override
	public void saveClient(Client theClient) {
		clientDAO.saveClient(theClient);
	}

	@Override
	@Transactional
	public Client getCustomer(int theId) {
		return clientDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		clientDAO.deleteClient(theId);
		
	}

	

	

}

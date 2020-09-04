package com.spring.dao;

import java.util.List;

import com.spring.entity.Client;

public interface ClientDAO {
	public List<Client> getClient();

	public void saveClient(Client theClient);

	public Client getCustomer(int theId);

	public void deleteClient(int theId);

	
}

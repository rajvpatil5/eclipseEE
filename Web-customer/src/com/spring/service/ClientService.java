package com.spring.service;

import java.util.List;

import com.spring.entity.Client;

public interface ClientService {

	public List<Client> getClient();

	public void saveClient(Client theClient);

	public Client getCustomer(int theId);

	public void deleteCustomer(int theId);


}

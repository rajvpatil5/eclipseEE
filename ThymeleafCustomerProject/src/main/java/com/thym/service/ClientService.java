package com.thym.service;

import java.util.List;

import com.thym.entity.Client;

public interface ClientService {

	public List<Client> findAll();

	public Client findById(int theId);

	public void save(Client theClient);

	public void deleteById(int theId);
}

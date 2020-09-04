package com.crud.rest.dao;

import java.util.List;

import com.crud.rest.entity.Client;

public interface ClientDAO {

	public List<Client> findAll();

	public Client findById(int theID);

	public void save(Client theClient);

	public void delete(int theID);

}

//In project demo-rest we use hibernate native method to preform crud operation, but in this project we are using EntityManager's methods to perform crud operations.

package com.crud.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.rest.entity.Client;

@Repository
public class ClientDAOImpl implements ClientDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<Client> findAll() {

		TypedQuery<Client> createQuery = entityManager.createQuery("from Client", Client.class);
		List<Client> resultList = createQuery.getResultList();
		return resultList;
	}

	@Override
	@Transactional
	public Client findById(int theID) {
		Client client = entityManager.find(Client.class, theID);
		return client;
	}

	@Override
	@Transactional
	public void save(Client theClient) {
		Client merge = entityManager.merge(theClient);
		theClient.setId(merge.getId());
	}

	@Override
	@Transactional
	public void delete(int theID) {
		Client client = entityManager.find(Client.class, theID);
		entityManager.remove(client);

	}

}

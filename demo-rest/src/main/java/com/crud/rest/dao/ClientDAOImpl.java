package com.crud.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
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

		Session unwrap = entityManager.unwrap(Session.class);
		Query<Client> createQuery = unwrap.createQuery("from Client", Client.class);
		List<Client> resultList = createQuery.getResultList();
		return resultList;
	}

	@Override
	@Transactional
	public Client findById(int theID) {
		Session unwrap = entityManager.unwrap(Session.class);
		Client client = unwrap.get(Client.class, theID);

		return client;
	}

	@Override
	@Transactional
	public void save(Client theClient) {
		Session unwrap = entityManager.unwrap(Session.class);
		unwrap.saveOrUpdate(theClient);

	}

	@Override
	@Transactional
	public void delete(int theID) {
		Session unwrap = entityManager.unwrap(Session.class);
		Client client = unwrap.get(Client.class, theID);
		unwrap.delete(client);

	}

}

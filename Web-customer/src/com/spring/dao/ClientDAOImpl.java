package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.Client;

@Repository
public class ClientDAOImpl implements ClientDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Client> getClient() {
		// get current hibernate session
		Session openSession = sessionFactory.openSession();

		Query<Client> createQuery = openSession.createQuery("from Client", Client.class);

		List<Client> resultList = createQuery.getResultList();

		return resultList;
	}

	@Override
	public void saveClient(Client theClient) {
		Session openSession = sessionFactory.getCurrentSession();
		openSession.saveOrUpdate(theClient);

	}

	@Override
	public Client getCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Client client = currentSession.get(Client.class, theId);
		return client;

	}

	@Override
	public void deleteClient(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Client client = currentSession.get(Client.class, theId);
		currentSession.delete(client);
		
//		you can also do like this
//		Session currentSession = sessionFactory.getCurrentSession();
//		Query query=currentSession.createQuery("delete from client where id=: clientID");
//		query.setParameter("clientID", theId);
//		query.executeUpdate();
//		but we do not use this, we are using @Transactional annotation to complete hibernate process
	}

}































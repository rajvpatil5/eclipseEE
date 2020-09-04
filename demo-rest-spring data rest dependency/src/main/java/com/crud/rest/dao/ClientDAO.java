package com.crud.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.rest.entity.Client;

public interface ClientDAO extends JpaRepository<Client, Integer> {

}

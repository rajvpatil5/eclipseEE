package com.thym.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thym.entity.Client;

public interface ClientDAO extends JpaRepository<Client, Integer> {

}

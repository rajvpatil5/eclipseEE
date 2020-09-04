package com.log.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.log.entity.Users;

public interface UsersDao extends JpaRepository<Users, Integer>  {

}

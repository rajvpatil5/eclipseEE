package com.log.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.log.dao.UsersProfileDao;
import com.log.entity.UsersProfile;

@RestController
public class LogRestController {

	@Autowired
	private UsersProfileDao usersProfileDao;

	
}

package com.log.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.log.dao.UsersDao;
import com.log.dao.UsersProfileDao;
import com.log.entity.Authorities;
import com.log.entity.Users;
import com.log.entity.UsersProfile;
import com.log.rest.DuplicateEmailException;

@Service
public class UsersProfileServiceImpl implements UserProfileService {

	@Autowired
	private UsersProfileDao usersProfileDao;
	
	@Autowired
	private UsersDao userDao;

	
	public void saveUserProfile(UsersProfile userProfile) {

		

			usersProfileDao.save(userProfile);
			
			String email = userProfile.getEmailId();
			String pass = userProfile.getPassword();

			Users users = new Users();
			users.setUsername(email);
			users.setPassword(pass);
			users.setEnable(1);

			Authorities authorities = new Authorities();
			authorities.setAuthority("ROLE_WEBUSER");
			authorities.setUsername(email);

			List<Authorities> listAuthotities = new ArrayList<Authorities>();
			listAuthotities.add(authorities);
			users.setAuthorities(listAuthotities);
			
			userDao.save(users);
			
		

	}
}

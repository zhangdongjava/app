package com.zzz.app.inner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzz.app.dao.sys.UserDao;
import com.zzz.app.domain.sys.User;
import com.zzz.app.inner.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int addUser(User user) {
		System.out.println("Ìí¼Ó user ¡ª¡ª>"+user);
		return userDao.add(user);
	}

}

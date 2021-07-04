package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.UserDao;
import com.app.model.User;

@Component
public class UserServiceImp implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	@Transactional
	public void save(User user) {
		userDao.Save(user);
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

}

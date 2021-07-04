package com.app.dao;

import java.util.List;

import com.app.model.User;


public interface UserDao {
	
	public void Save(User user);
	
	public List<User> list();

}

package com.app.service;

import java.util.List;


import com.app.model.User;

public interface UserService {
	
	void save(User user);
	List<User> list();

}

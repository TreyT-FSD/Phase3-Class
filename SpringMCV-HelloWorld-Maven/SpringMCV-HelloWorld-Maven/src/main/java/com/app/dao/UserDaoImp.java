package com.app.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.User;

@Component
public class UserDaoImp implements UserDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void Save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> list() {
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

}

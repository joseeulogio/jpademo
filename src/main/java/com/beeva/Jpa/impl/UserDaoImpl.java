package com.beeva.Jpa.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.Jpa.dao.UserDao;
import com.beeva.Jpa.model.User;
@Repository
public class UserDaoImpl extends UserDao{
	@PersistenceContext
	EntityManager em;
@Override
@Transactional
	public void save(User user) {
		em.persist(user);
		
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.beeva.Jpa.dao;



import com.beeva.Jpa.model.User;

public abstract class  UserDao {
	public abstract void save(User user);
	public abstract User getUser(int id);

}

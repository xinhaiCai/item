package com.rent.dao;

import java.util.List;

import com.rent.user.User;

public interface IUserDAO {
	public User findById(String id);
	public List findByUsername(Object username);
	public void save(User user);
}

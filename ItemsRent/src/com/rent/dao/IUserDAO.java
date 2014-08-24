package com.rent.dao;

import java.util.List;

import com.rent.bean.User;

public interface IUserDAO {
	public User findById(String id);
	public List findByUsername(Object user_name);
	public void save(User user);
}

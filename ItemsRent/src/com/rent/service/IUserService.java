package com.rent.service;

import com.rent.bean.User;

public interface IUserService {
public User getUserById(String id);
public User getUserByUsername(String username);
public void addUser(User user);
}

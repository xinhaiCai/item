package com.rent.service.impl;

import com.rent.dao.IUserDAO;
import com.rent.service.IUserService;
import com.rent.user.User;

import java.util.List;

public class UserService implements IUserService {

	private IUserDAO userDAO;
	
	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return userDAO.findById(id);
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		List list= userDAO.findByUsername(username);
		if(list.size()==0){
			return null;
		}else{
			return (User)list.get(0);
		}
	}

	public IUserDAO getUserDAO(){
		return userDAO;
	}
	
	public void setUserDAO(IUserDAO userDAO){
		this.userDAO=userDAO;
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
userDAO.save(user);
	}

}

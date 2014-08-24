package com.rent.service.impl;

import com.rent.bean.User;
import com.rent.dao.IUserDAO;
import com.rent.service.IUserService;

import java.util.List;

public class UserService implements IUserService {

	private IUserDAO userDAO;
	
	@Override
	public User getUserById(String user_id) {
		// TODO Auto-generated method stub
		return userDAO.findById(user_id);
	}

	@Override
	public User getUserByUsername(String user_name) {
		// TODO Auto-generated method stub
		List list= userDAO.findByUsername(user_name);
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
		userDAO.save(user);
	}

}

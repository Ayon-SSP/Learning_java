package com.training.demo.service;

import java.util.List;

import com.training.demo.collection.UserList;
import com.training.demo.model.User;

public class UserService implements IService<User> {

	private UserList userList;
	
	
	public UserService(UserList userList) {
		super();
		this.userList = userList;
	}

	@Override
	public User create(User t) throws Exception {
	
		return userList.create(t);
	}

	@Override
	public boolean update(int id, User t) throws Exception {

		return userList.update(id, t);
	}

	@Override
	public boolean delete(int id) throws Exception {
		
		return userList.delete(id);
	}

	@Override
	public User findOne(int id) throws Exception {
		
		return userList.findOne(id);
	}

	@Override
	public List<User> findAll() throws Exception {
		
		return userList.findAll();
	}

	
}

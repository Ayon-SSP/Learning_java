package com.training.demo.collection;

import java.util.List;

import com.training.demo.dao.UserDao;
import com.training.demo.model.User;

public class UserList implements IList<User>{

	private UserDao userDao;
	
	public UserList(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public User create(User t) throws Exception {
	
		return userDao.create(t);
	}

	@Override
	public boolean update(int id, User t) throws Exception {
		
		return userDao.update(id, t);
	}

	@Override
	public boolean delete(int id) throws Exception {

		return userDao.delete(id);
	}

	@Override
	public User findOne(int id) throws Exception {
		
		return userDao.findOne(id);
	}

	@Override
	public List<User> findAll() throws Exception {
		
		return userDao.findAll();
	}

	
}

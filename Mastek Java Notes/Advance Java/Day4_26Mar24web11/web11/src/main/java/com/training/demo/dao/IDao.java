package com.training.demo.dao;

import java.util.List;

public interface IDao<T> {

	List<T> findAll() throws Exception;
	T findOne(int id) throws Exception;
	boolean create(T t) throws Exception;
	boolean update(int id, T t) throws Exception;
	boolean delete(int id) throws Exception;
}

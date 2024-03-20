package com.training.demo.dao;

import java.util.List;

public interface IDao<T> {

//	T create(T t) throws Exception;
	T findOne(int id)throws Exception;
	List<T> findALL()throws Exception;
	//update
	//delete
}

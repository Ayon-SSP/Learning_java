package com.training.demo.dao;

import java.util.List;

public interface IDao<T> {

	T findOne(int id)throws Exception;
	List<T> findALL()throws Exception;

}

package com.training.bankapp.util;
 
import java.util.List;
 
public interface IList<T> {
	// CRUD
	// CREATE
	T add(T t);
 
	// RETRIVE - Based on unique id
	T findById(int id);
 
	// RETRIVE - All objects
	List<T> findAll();
 
	// UPDATE
	boolean update(int id, T t);
 
	// DELETE
	boolean deete(int id);
 
}
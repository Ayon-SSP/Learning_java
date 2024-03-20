package com.training.demo.dao;

import java.util.List;

public interface IDao<T> {

	void save(T t);
    void update(T t);
    void delete(T t);
    T getById(Long id);
    List<T> getAll();
}

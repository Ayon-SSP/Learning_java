package com.training.demo.util;

import java.util.HashSet;
import java.util.Set;

import com.training.demo.model.Person;

public class People implements ISet<Person>{

	Set<Person> people =new HashSet<>();

	@Override
	public Set<Person> findAll() {
	
		return people;
	}
	
	
	
}

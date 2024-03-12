package com.training.demo.util;

import java.util.Comparator;

import com.training.demo.model.Student;

public class OrderByStudentNameDesc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getStudentName().compareTo(o1.getStudentName());
	}

	
}

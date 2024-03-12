package com.training.demo.util;

import java.util.Comparator;

import com.training.demo.model.Student;

public class StudentOrderByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
	
		return o1.getStudentName().compareTo(o2.getStudentName());
	}

	
}

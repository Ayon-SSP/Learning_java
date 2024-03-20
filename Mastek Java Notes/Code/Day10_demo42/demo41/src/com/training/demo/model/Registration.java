package com.training.demo.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registration {

	private int registrationId;
	private static final Map<Student,List<Course>> studentCourse=new HashMap<>();
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int registrationId) {
		super();
		this.registrationId = registrationId;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public static Map<Student, List<Course>> getStudentcourse() {
		return studentCourse;
	}
	@Override
	public String toString() {
		return "Registration [registrationId=" + registrationId + "]";
	}

	
	
}

package com.training.demo.model;

public class Student {

	private int studetnId;
	private String fullName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studetnId, String fullName) {
		super();
		this.studetnId = studetnId;
		this.fullName = fullName;
	}
	public int getStudetnId() {
		return studetnId;
	}
	public void setStudetnId(int studetnId) {
		this.studetnId = studetnId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Student [studetnId=" + studetnId + ", fullName=" + fullName + "]";
	}
	
	
}

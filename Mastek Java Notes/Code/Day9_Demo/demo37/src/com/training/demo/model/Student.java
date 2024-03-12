package com.training.demo.model;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + studetnId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if (fullName == null) {
			if (other.fullName != null) {
				return false;
			}
		} else if (!fullName.equals(other.fullName)) {
			return false;
		}
		if (studetnId != other.studetnId) {
			return false;
		}
		return true;
	}
	
	
	
}

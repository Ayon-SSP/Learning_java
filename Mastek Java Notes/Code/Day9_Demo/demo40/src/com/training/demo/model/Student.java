package com.training.demo.model;

import java.util.Set;

public class Student implements Comparable<Student>{

	private int studnetId;
	private String studentName;
	private Set<Course> courses;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studnetId, String studentName, Set<Course> courses) {
		super();
		this.studnetId = studnetId;
		this.studentName = studentName;
		this.courses = courses;
	}
	public int getStudnetId() {
		return studnetId;
	}
	public void setStudnetId(int studnetId) {
		this.studnetId = studnetId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [studnetId=" + studnetId + ", studentName=" + studentName + ", courses=" + courses + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courses == null) ? 0 : courses.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + studnetId;
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
		if (courses == null) {
			if (other.courses != null) {
				return false;
			}
		} else if (!courses.equals(other.courses)) {
			return false;
		}
		if (studentName == null) {
			if (other.studentName != null) {
				return false;
			}
		} else if (!studentName.equals(other.studentName)) {
			return false;
		}
		if (studnetId != other.studnetId) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Student o) {

		return this.studnetId-o.studnetId;
	}
	
	
	
	
	
}

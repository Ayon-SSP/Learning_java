package com.training.demo.model;

import java.time.LocalDate;

public class Student implements Comparable<Student>{
	private int studentId;
	private String studentName;
	private LocalDate joinDate;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, LocalDate joinDate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.joinDate = joinDate;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", joinDate=" + joinDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((joinDate == null) ? 0 : joinDate.hashCode());
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
		if (joinDate == null) {
			if (other.joinDate != null) {
				return false;
			}
		} else if (!joinDate.equals(other.joinDate)) {
			return false;
		}
		if (studentId != other.studentId) {
			return false;
		}
		if (studentName == null) {
			if (other.studentName != null) {
				return false;
			}
		} else if (!studentName.equals(other.studentName)) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Student o) {
	
		return this.studentId-o.studentId;
	}
	

}

package com.training.demo.model;

public class Course implements Comparable<Course>{

	private int courseId;
	private String courseName;
	private int durationInHour;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, int durationInHour) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.durationInHour = durationInHour;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDurationInHour() {
		return durationInHour;
	}
	public void setDurationInHour(int durationInHour) {
		this.durationInHour = durationInHour;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", durationInHour=" + durationInHour
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseId;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + durationInHour;
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
		Course other = (Course) obj;
		if (courseId != other.courseId) {
			return false;
		}
		if (courseName == null) {
			if (other.courseName != null) {
				return false;
			}
		} else if (!courseName.equals(other.courseName)) {
			return false;
		}
		if (durationInHour != other.durationInHour) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(Course o) {

		return this.courseId-o.courseId;
	}
	
	
}

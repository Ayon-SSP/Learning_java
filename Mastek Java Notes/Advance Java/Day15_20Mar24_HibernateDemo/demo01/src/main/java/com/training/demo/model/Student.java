package com.training.demo.model;
import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name="Students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @SequenceGenerator(name = "student_sequence", sequenceName = "STUDENT_SEQ", allocationSize = 1)
    private Long id;
    private String name;
    
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Course course;
    
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public Student(String name, Course course) {
		super();
		this.name = name;
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id);
	}


}

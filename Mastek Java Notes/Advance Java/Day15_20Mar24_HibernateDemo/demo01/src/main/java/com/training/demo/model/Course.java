package com.training.demo.model;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")
    @SequenceGenerator(name = "course_sequence", sequenceName = "COURSE_SEQ", allocationSize = 1)    
    private Long id;
    private String name;
    
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Long id, String name, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}

	public Course(String name, Student student) {
		super();
		this.name = name;
		this.student = student;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", student=" + student + "]";
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
		Course other = (Course) obj;
		return Objects.equals(id, other.id);
	}


}

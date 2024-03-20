package com.training.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.training.demo.model.Course;
import com.training.demo.model.Registration;
import com.training.demo.model.Student;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(1,"Amit", LocalDate.now());
		List<Course> courses=new ArrayList<>();
		courses.add(new Course(3,"OCJP",60));
		courses.add(new Course(1,"Oracle Sql",40));
		courses.add(new Course(2,"Oracle PLSQL",60));
		Registration registration=new Registration(1);
		Map<Student,List<Course>> studentCourse=registration.getStudentcourse();
		studentCourse.put(s1, courses);
//		System.out.println(studentCourse);
		
		for(Map.Entry<Student, List<Course>> e: studentCourse.entrySet()) {
			
			for(Course c: e.getValue()) {
				System.out.println(e.getKey().getStudentId()+": "+c.getCourseId()+":"+c.getCourseName());
			}
			
		}
	}

}

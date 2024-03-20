package com.training.demo;

import java.util.Set;
import java.util.TreeSet;

import com.training.demo.model.Course;
import com.training.demo.model.Student;

public class Main {

	public static void main(String[] args) {
		Set<Course> courses=new TreeSet<>();
		courses.add(new Course(3,"OCJP",60));
		courses.add(new Course(1,"Oracle Sql",40));
		courses.add(new Course(2,"Oracle PLSQL",60));
		
//		Student s1=new Student(1,"Amit", courses);
//
//		for(Course c: s1.getCourses()) {
//			System.out.println(c);
//		}
		Set<Student> students=new TreeSet<>();
		students.add(new Student(1,"Ajit", courses));
		students.add(new Student(2,"Amit", courses));
		students.add(new Student(3,"Ankit", courses));
		
		for(Student s: students) {
			System.out.print(s.getStudnetId()
					+" "
					+s.getStudentName());
			for(Course c: s.getCourses()) {
				System.out.println(c);
			}
			System.out.println();
		}
	}

}

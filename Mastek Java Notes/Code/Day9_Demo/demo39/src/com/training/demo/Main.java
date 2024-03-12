package com.training.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.training.demo.model.Student;
import com.training.demo.util.OrderByStudentNameDesc;
import com.training.demo.util.StudentOrderByName;

public class Main {

	public static void main(String[] args) {
//		listDemo();
//		setDemo();
		Set<Student> studentSet=new TreeSet<>();//Comparable
		studentSet.add(new Student(1,"Amit",LocalDate.of(2000, 10, 29)));//0
		studentSet.add(new Student(2,"Ajit",LocalDate.of(2000, 10, 12)));//1
		studentSet.add(new Student(3,"Amita",LocalDate.of(2000, 10, 13)));//2
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 14)));//3
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 15)));//3
		
		for (Student s:studentSet) {
			System.out.println(s);
		}
		//Comparator: order by studentid desc
		Comparator<Student> comparator=new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				
				return o2.getStudentId()-o1.getStudentId();
			}
		};
		System.out.println("Oder by Studentid desc");
		studentSet=new TreeSet<>(comparator);//Comparable
		studentSet.add(new Student(1,"Amit",LocalDate.of(2000, 10, 29)));//0
		studentSet.add(new Student(2,"Ajit",LocalDate.of(2000, 10, 12)));//1
		studentSet.add(new Student(3,"Amita",LocalDate.of(2000, 10, 13)));//2
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 14)));//3
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 15)));//3
		
		for (Student s:studentSet) {
			System.out.println(s);
		}
		System.out.println("Oder by StudentName Asc");
		studentSet=new TreeSet<>(new StudentOrderByName());//Comparable
		studentSet.add(new Student(1,"Amit",LocalDate.of(2000, 10, 29)));//0
		studentSet.add(new Student(2,"Ajit",LocalDate.of(2000, 10, 12)));//1
		studentSet.add(new Student(3,"Amita",LocalDate.of(2000, 10, 13)));//2
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 14)));//3
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 15)));//3
		
		for (Student s:studentSet) {
			System.out.println(s);
		}
		System.out.println("Oder by StudentName Desc");
		studentSet=new TreeSet<>(new OrderByStudentNameDesc());//Comparable
		studentSet.add(new Student(1,"Amit",LocalDate.of(2000, 10, 29)));//0
		studentSet.add(new Student(2,"Ajit",LocalDate.of(2000, 10, 12)));//1
		studentSet.add(new Student(3,"Amita",LocalDate.of(2000, 10, 13)));//2
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 14)));//3
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 15)));//3
		
		for (Student s:studentSet) {
			System.out.println(s);
		}

	}

	private static void setDemo() {
		Set<Student> studentSet=new HashSet<>();
		studentSet.add(new Student(1,"Amit",LocalDate.of(2000, 10, 15)));//0
		studentSet.add(new Student(2,"Ajit",LocalDate.of(2000, 10, 15)));//1
		studentSet.add(new Student(3,"Amita",LocalDate.of(2000, 10, 15)));//2
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 15)));//3
		studentSet.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 15)));//3
		
		Iterator<Student> iterator=studentSet.iterator();
		System.out.println("For each - iterator ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("For each - SET ");
		for(Student s: studentSet) {
			System.out.println(s);
		}
		Student removeObj=new Student(4,"Ankit",LocalDate.of(2000, 10, 15));
		studentSet.remove(removeObj);
		System.out.println("After remove For each - SET ");
		for(Student s: studentSet) {
			System.out.println(s);
		}
	}

	private static void listDemo() {
		//Create a list of student
		List<Student>  studentList=new ArrayList<>();
		//adding data to the list
		studentList.add(new Student(1,"Amit",LocalDate.of(2000, 10, 15)));//0
		studentList.add(new Student(2,"Ajit",LocalDate.of(2000, 10, 15)));//1
		studentList.add(new Student(3,"Amita",LocalDate.of(2000, 10, 15)));//2
		studentList.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 15)));//3
		
		System.out.println(studentList );
		iterateEachStudent(studentList);
		printEachStudent(studentList);
		//Remove 
		System.out.println("remove student from the list");
		studentList.remove(3);
		printEachStudent(studentList);
		System.out.println("add student from the list");
		studentList.add(new Student(4,"Ankit",LocalDate.of(2000, 10, 15)));//3
		printEachStudent(studentList);
	}

	private static void iterateEachStudent(List<Student> studentList) {
		//Iterator using iterator
		System.out.println("using iterator");
		Iterator<Student> iterator=studentList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static void printEachStudent(List<Student> studentList) {
		System.out.println("using for each loop");
		// for each loop ****** 
		for(Student student: studentList ) {
			System.out.println(student);
		}
	}
}

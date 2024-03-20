package com.training.demo.model;

public class Main {

	public static void main(String[] args) {
		//Object datamember values are same then
		// object comparison should return true 
		// we must provide equals and hashcodel logic
		Student stdudent1=new Student(1,"Amit");
		Student stdudent2=new Student(1,"Amit");
		//override object class equals() and hashcode() for comparing object equality
		//based on field values of the two object in comparison
		System.out.println(stdudent1.equals(stdudent2));
	}

}

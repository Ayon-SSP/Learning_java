package com.training.demo;

//static variable
public class Main {
	// data memeber
	static int number1 = 10;
	int number2 = 20; // non static variable

	public static void main(String[] args) {
//		System.out.println("Number2: "+number2); //error
		Main main = new Main();
		System.out.println("number2= " + main.number2);
		// System.out.println(number2); //error

		System.out.println("Number1: " + number1);
		System.out.println("Number1: " + Main.number1);
		System.out.println("Number1: " + main.number1);
	}

}
//Static keyword
//Static keyword is applicable to variable,methods and nested classes
//here main() method is a static block/function
//Static function can work with static datamember even without creating an object
//Static function can't work wtih non static datamember
//if we want to acccess non static data member we have to create object and call it
//we can get static variable values in static/non-static block as follows
//	1. directly call the variable
//	2. call it with the class name Main.number1
//  3. call it with the object main.number1

// we can't access any non static things in static methods or blocks or nested classes.
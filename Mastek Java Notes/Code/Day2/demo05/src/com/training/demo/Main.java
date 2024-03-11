package com.training.demo;

import com.training.demo.model.Greeting;

public class Main {

	public static void main(String[] args) {
		Greeting greeting=new Greeting();// objec1
		System.out.println("Greeting No: "+greeting.getGreetingNo());
		System.out.println("Greeting Message: "+greeting.getMessage());
		System.out.println("Creating 2 nd greeting object ");
		
		Greeting greeting1=new Greeting();// objec2
		System.out.println("Greeting No: "+greeting1.getGreetingNo());
		System.out.println("Greeting Message: "+greeting1.getMessage());
		
		greeting.setMessage("Welcome to Java");
		System.out.println("Greeting Message: "+greeting.getMessage());
		System.out.println("Greeting1 Message: "+greeting1.getMessage());
	}
}

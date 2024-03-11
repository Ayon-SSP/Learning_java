package com.training.demo;

public class Main {

	public static void main(String[] args) {
		Logger logger=new StringLogger();//child object 
		System.out.println("Child class object");
		System.out.println(logger.myLogger());
		//parent ref calling child class method
		System.out.println(((StringLogger)logger).myLogger("calling child method"));
		
	}

}

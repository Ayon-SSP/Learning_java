package com.training.demo;

public class Main {

	public static void main(String[] args) {
		Logger logger=null;//ref variable	
		
		logger=new Logger();//parent object 
		System.out.println("Parent class object");
		System.out.println(logger.myLogger());
		
		logger=new StringLogger();//child object 
		System.out.println("Child class object");
		System.out.println(logger.myLogger());
		//parent ref calling child class method
		System.out.println(((StringLogger)logger).myLogger("calling child method"));
		System.out.println("@@@@@@@@@@@");
		StringLogger stringLogger=new StringLogger();
		System.out.println(stringLogger.myLogger());
		System.out.println(stringLogger.myLogger("using child object"));
	}

}

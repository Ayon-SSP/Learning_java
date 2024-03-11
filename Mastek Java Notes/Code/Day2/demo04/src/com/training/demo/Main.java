package com.training.demo;

import com.training.demo.model.Greeting;

public class Main {

	public static void main(String[] args) {
		//to import ctrl+shift+o
		Greeting greeting1=new Greeting();//1
		Greeting greeting2=new Greeting();//2
		
		//Testing Default values for Field variable
		System.out.println("Greeting 1 ");
		System.out.println("Greeting No: "+greeting1.getGreetingNo());
		System.out.println("Message: "+greeting1.getMessage());
		
		System.out.println("Greeting 2 ");
		System.out.println("Greeting No: "+greeting2.getGreetingNo());
		System.out.println("Message: "+greeting2.getMessage());
		//Local variable must be declared and initialised before use	
		int num=99;
		String someMessage="Some message over here";
		
		System.out.println("num="+num);
		System.out.println("someMessage="+someMessage);
		
	}

}

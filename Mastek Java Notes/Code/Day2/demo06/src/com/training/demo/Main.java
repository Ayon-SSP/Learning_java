package com.training.demo;

import com.training.demo.model.Greeting;
import com.training.demo.model.Person;

public class Main {

	public static void main(String[] args) {
		//Good Morning
		Greeting greeting=new Greeting();
		//we have called mutators/setters to change the value to meaningful data
		greeting.setGreetingNo(100);
		greeting.setMessage("Good Morning");
		
		System.out.println(greeting.getGreetingNo()
					+" "
					+greeting.getMessage());
		
		Greeting greeting1=new Greeting();
		//we have called mutators/setters to change the value to meaningful data
		greeting1.setGreetingNo(101);
		greeting1.setMessage("Good Afternoon");
		
		System.out.println(greeting1.getGreetingNo()
					+" "
					+greeting1.getMessage());
		System.out.println("#########################");
		Person p1=new Person();
		Person p2=new Person();
		//setter
		p1.setUid(1001);
		p2.setUid(1002);
		
		p1.setName("Ajit");
		p2.setName("Amit");
		
		System.out.println("P1.uid "+p1.getUid());
		System.out.println("P2.uid "+p2.getUid());
		
		System.out.println("P1.name "+p1.getName());
		System.out.println("P2.name "+p2.getName());
		
	}

}

package com.training.demo;

import com.training.demo.model.Contact;
import com.training.demo.model.Greeting;

public class Main {

	public static void main(String[] args) {
		Greeting greeting1=new Greeting();
		Greeting greeting2=new Greeting(101,"Happy Holi!!!!");		
		System.out.println("Greeting 1");
		System.out.println(greeting1.getId()+" , "+greeting1.getMessage());
		System.out.println("Greeting 2");
		System.out.println(greeting2.getId()+" , "+greeting2.getMessage());
		
		Contact contact1=new Contact(1, "Ajit",  "9876543210", "ajit@some.com");
		Contact contact2=new Contact(2, "Amit",  "9876543211", "amit@some.com");
		Contact contact3=new Contact(3, "Ankit", "9876543212", "ankit@some.com");
		Contact contact4=new Contact(4, "Sumit", "9876543213", "sumit@some.com");
		
		System.out.println("Email address of all four contacts");
		System.out.println(contact1.getEmail());
		System.out.println(contact2.getEmail());
		System.out.println(contact3.getEmail());
		System.out.println(contact4.getEmail());
		
		System.out.println(contact1.getId()+", "
				+contact1.getName()+", "
				+contact1.getPhoneNo()+", "
				+contact1.getEmail());
		System.out.println("contact1.toString(): "+contact1.toString()
				);
		System.out.println("contact1.toString(): "+contact2.toString()
				);
		System.out.println("contact1.toString(): "+contact3.toString()
				);
		System.out.println("contact1.toString(): "+contact4.toString()
				);
		
		System.out.println(greeting1.toString());// id,message
		System.out.println(greeting2.toString());
		System.out.println("not calling toString() explicitly");
		System.out.println(greeting2);
		System.out.println(contact1);
		
		
		
	}

}

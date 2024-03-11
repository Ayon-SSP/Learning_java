// In static methods
// 1. Create objects
// 2. call static methods
// 3. can access static variables
// 4. object.datamembers
// 5. object.methods
// Remember static bloc donot support call to nonstatic variables/methods 
package com.training.demo;

import com.training.demo.model.Greeting;

public class Main {

	public static void main(String[] args) {
		// 1. Create objects
		Greeting greeting = new Greeting();
		// 2. object.methods
		greeting.setMessage("Gutan Morgan");
		System.out.println(greeting.getMessage());
		// 3. object.datamember when the data member is public
		System.out.println(greeting.message);
		//4. calling static function of another class 
		System.out.println("Greeting.greet() called by Class Name: "+Greeting.greet());
		System.out.println("greeting.greet() called by object: "+greeting.greet());
		//Non static 
		Main main=new Main();
		System.out.println(main.myLogger("Non static function called" ));
		//Calling static method
		System.out.println(myLoggerStatic("Static function called directly" ));
		System.out.println(Main.myLoggerStatic("Static function called using Class Name" ));
		System.out.println(main.myLoggerStatic("Static function called using object" ));
	}

	// non static method in Main class
	public String myLogger(String message) {

		return message;
	}
	// static method in Main class
	public static String myLoggerStatic(String message) {

		return message;
	}
}

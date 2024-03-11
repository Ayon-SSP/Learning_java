package com.training.demo;
import com.training.demo.german.GreetingGerman;
public class Main {

	public static void main(String[] args) {
		Greeting greeting=new Greeting();
		greeting.message="Example of Default access specifier";
		System.out.println("Message: "+greeting.message);
		
		GreetingGerman greetingGerman=new GreetingGerman();
		greetingGerman.message="Using default in another package";
		System.out.println("Message: "+greetingGerman.message);
	}

}
//Greeting class is in same package
//message data member has default access -> Accessible at package level
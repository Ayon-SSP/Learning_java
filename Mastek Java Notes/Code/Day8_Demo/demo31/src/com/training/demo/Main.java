package com.training.demo;

import com.training.demo.model.EnglishGreeting;
import com.training.demo.model.IGreeting;

public class Main {

	public static void main(String[] args) {
		IGreeting greeting=new EnglishGreeting();
		System.out.println(greeting.greet());
		System.out.println(greeting.greet("Good Morning!"));
		//Anonymous class using interface
		greeting=new IGreeting() {

			@Override
			public String greet() {
			
				return "Hi!";
			}

			@Override
			public String greet(String msg) {
			
				return msg.toUpperCase();
			}
			
		};
		System.out.println(greeting.greet());
		System.out.println(greeting.greet("Hola Amigo!!!"));
	}

}

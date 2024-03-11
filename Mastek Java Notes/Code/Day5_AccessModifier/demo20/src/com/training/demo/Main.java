package com.training.demo;

import com.training.demo.ext.BirthdayGreeting;
import com.training.demo.model.EnglishGreeting;
import com.training.demo.model.GermanGreeting;

public class Main {

	public static void main(String[] args) {
		EnglishGreeting englishGreeting=new EnglishGreeting("Good Morning!!");
		System.out.println(englishGreeting);
		
		GermanGreeting germanGreeting=new GermanGreeting("Gutan Morgan");
		System.out.println(germanGreeting);

		BirthdayGreeting greeting=new BirthdayGreeting("Happy Birthday!");
		System.out.println(greeting);
	}

}

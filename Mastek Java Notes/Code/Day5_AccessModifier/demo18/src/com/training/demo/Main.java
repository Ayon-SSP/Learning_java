package com.training.demo;

import com.training.demo.model.Greeting;

public class Main {

	public static void main(String[] args) {
		Greeting greeting=new Greeting();
		greeting.setMessage("Access demo");
		System.out.println(greeting.getMessage());
	}
}

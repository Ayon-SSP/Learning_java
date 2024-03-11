package com.training.demo.ext;

import com.training.demo.model.Greeting;

public class BirthdayGreeting extends Greeting {

	public BirthdayGreeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BirthdayGreeting(String message) {
		super(message);

	}

	@Override
	public String toString() {
		return "BirthdayGreeting [message=" + message + "]";
	}

	
}

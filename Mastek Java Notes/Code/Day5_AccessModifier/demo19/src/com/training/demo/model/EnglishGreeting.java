package com.training.demo.model;

public class EnglishGreeting extends Greeting {

	public EnglishGreeting() {
		super();

	}

	public EnglishGreeting(String message) {
		super(message);

	}

	@Override
	public String toString() {
		return "EnglishGreeting [message=" + message + "]";
	}

}

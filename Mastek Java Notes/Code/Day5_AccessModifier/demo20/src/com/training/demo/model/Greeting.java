package com.training.demo.model;

public class Greeting {
	
	protected String message;

	public Greeting() {
		super();

	}

	public Greeting(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Greeting [message=" + message + "]";
	}

}

//Example of Inheritance with default modifier
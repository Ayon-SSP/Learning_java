package com.training.demo.model;

public class GermanGreeting extends Greeting {

	public GermanGreeting() {
		super();

	}

	public GermanGreeting(String message) {
		super(message);

	}

	@Override
	public String toString() {
		return "GermanGreeting [message=" + message + "]";
	}

}

package com.training.demo.model;

public class EnglishGreeting implements IGreeting {

	@Override
	public String greet() {

		return "Hello!";
	}

	@Override
	public String greet(String msg) {

		return msg;
	}

}

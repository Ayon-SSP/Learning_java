package com.training.demo.model;

public class Greeting {

	private int id;
	private String message;

	public Greeting() {
		System.out.println("calling Greeting()");
	}

	public Greeting(int id, String message) {
		System.out.println("calling Greeting(int id, String message)");
		this.id = id;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	//alt+s+s+s
//	@Override
//	public String toString() {
//		return "Greeting [id=" + id + ", message=" + message + "]";
//	}	
}
//1. Default Constructor : alt+s+c
//2. Overloaded/parameterised:alt+s+a
//3. Overloading the constructor
//4. getter/setter - field/instance variables
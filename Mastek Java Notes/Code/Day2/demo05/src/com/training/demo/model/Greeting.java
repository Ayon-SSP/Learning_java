package com.training.demo.model;
public class Greeting {
	private int greetingNo;
	private String message;	
	//default constructor: we have given explicitly values to field
	//variables
	public Greeting() {
		System.out.println("public Greeting() called");
		this.greetingNo=1;
		this.message="Welcome";
	}
	public int getGreetingNo() {
		return greetingNo;
	}
	public void setGreetingNo(int greetingNo) {
		this.greetingNo = greetingNo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

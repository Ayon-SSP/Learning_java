//This is a demo of POJO
package com.training.demo.model;

public class Greeting {

	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static String greet() {
		return "Static Greet method of Greeting called";
	}
}

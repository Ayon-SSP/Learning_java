package com.training.demo;

public class StringLogger extends Logger {

	public String myLogger() {
		return "child myLogger() called";
	}
	public String myLogger(String msg) {
		return "#### \t\t"+msg;
	}
}


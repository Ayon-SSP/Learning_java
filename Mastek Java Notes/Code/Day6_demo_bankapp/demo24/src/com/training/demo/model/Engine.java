package com.training.demo.model;

public class Engine {

	private boolean isStarted;

	public Engine() {
		super();

	}

	public boolean isStarted() {
		return isStarted;
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}
	public boolean startEngine() {
		isStarted=true;
		System.out.println("Engine Started ");
		return isStarted;
	}
	
}

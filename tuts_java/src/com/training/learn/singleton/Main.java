package com.training.learn.singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Engine engine1=Engine.getEngine();// called 1st time engine=null so it created 
		Engine engine2=Engine.getEngine();// engine!=null => it refer to previously created 
		
		System.out.println("Confirm engine1 and engine2 are pointing to same object in memory");
		
		if(engine1==engine2) {
			System.out.println("Same object");
		}else {
			System.out.println("different object");
		}
		
	}

}

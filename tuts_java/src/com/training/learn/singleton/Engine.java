package com.training.learn.singleton;

public class Engine {

	private static Engine engine;
	private static int counter=0;
	
	{
		counter++;
	}
	// since constructor is private
	// we must create object inside the class
	private Engine() {
		System.out.println(counter);
	}

	// public static Engine synchronized getEngine() { -<or>-
	public static Engine getEngine() {
		System.out.println("engine="+engine);
		//1/2/3
		if(engine==null) {
			//2/3
			synchronized (Engine.class) {
				if(engine==null) {
					engine=new Engine();
				}
			}			
		}
			
		return engine;
	}

}

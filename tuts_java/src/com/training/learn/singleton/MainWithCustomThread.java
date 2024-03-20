package com.training.learn.singleton;

public class MainWithCustomThread {

	public static void main(String[] args) {
		Runnable runner1=new Runnable() {

			@Override
			public void run() {
				Engine engine=Engine.getEngine();	
				System.out.println("Engine: "+engine);			
			}
			
		};
		
		Thread thread1=new Thread(runner1);
		Thread thread2=new Thread(runner1);
		Thread thread3=new Thread(runner1);
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}

}
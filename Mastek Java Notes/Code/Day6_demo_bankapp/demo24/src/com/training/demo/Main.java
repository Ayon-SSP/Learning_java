package com.training.demo;

import com.training.demo.model.Car;
import com.training.demo.model.Engine;

public class Main {

	public static void main(String[] args) {
		
			Engine engine=new Engine();
			Car car =new Car(1,engine,"Toyoto","SUV","BLACK");
			System.out.println("Start the car");
			if(car.start()) {
				System.out.println("Car started");
			}else {
				System.out.println("Car not started");
			}
	}	
}

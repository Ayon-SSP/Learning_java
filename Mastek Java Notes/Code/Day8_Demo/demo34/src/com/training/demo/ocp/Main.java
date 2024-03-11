package com.training.demo.ocp;

public class Main {

	public static void main(String[] args) {
		// SRP+OCP
		Shape circle=new Circle(10);
		Shape rectangle=new Rectangle(10,10);
		Shape triangle=new Triangle(10, 10);

		circle.draw();
		rectangle.draw();
		triangle.draw();
	}

}

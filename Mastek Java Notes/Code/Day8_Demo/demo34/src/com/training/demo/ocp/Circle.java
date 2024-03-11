package com.training.demo.ocp;

public class Circle extends Shape {

	private int radius;
	public Circle() {
		super();
	
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calcualteArea() {

		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public void draw() {

		System.out.println("Circle with area "+calcualteArea()+" is drawn");
	}

	
}

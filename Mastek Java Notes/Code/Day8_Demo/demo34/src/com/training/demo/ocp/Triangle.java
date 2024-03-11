package com.training.demo.ocp;

public class Triangle extends Shape {

	private int length;
	private int width;

	public Triangle() {
		super();
	}

	public Triangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double calcualteArea() {
		
		return 0.5*length*width;
	}

	@Override
	public void draw() {
		System.out.println("Triangle with area "+calcualteArea()+" is drawn");
	}

}

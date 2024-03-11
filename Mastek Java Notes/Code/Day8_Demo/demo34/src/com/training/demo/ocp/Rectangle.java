package com.training.demo.ocp;

public class Rectangle extends Shape {


	private int length;
	private int width;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int length, int width) {
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
		
		return length*width;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle with area "+calcualteArea()+" is drawn");
	}

}

package com.training.demo.p1;
// Not a best practice
//enum: integer constants
//public static final int Circle=0;
//public static final int Triangle=1;
//public static final int Rectangle=2;
public class Shape {
	
	public enum ShapeType{CIRCLE,TRIANGLE, RECTANGLE };
	
	private ShapeType shapeType;
	private int radius;
	private int length;
	private int width;
	
	public Shape() {
		super();
	
	}

	public Shape(ShapeType shapeType) {
		super();
		this.shapeType = shapeType;
	}
	
	public double calcualteArea() {
		double area=0.0;
		switch(shapeType) {
		case CIRCLE:
				area=Math.PI*Math.pow(this.radius, 2);
				break;
		case TRIANGLE:
			area=length*width*0.5;
				break;
		case RECTANGLE:
			area=length*width;
				break;
		default:
			System.out.println("Not selected shape");break;				
		
		}
		return area;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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
	

}

//if inner class is required outsidethe class or package -> public
//enum when you are declaring enum enum <name>{} it must be public it can be access outside the class as package
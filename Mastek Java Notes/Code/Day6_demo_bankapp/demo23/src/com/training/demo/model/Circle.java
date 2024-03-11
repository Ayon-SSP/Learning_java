package com.training.demo.model;

public class Circle {

	private Point centerPoint;
	private int radius;
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(Point centerPoint, int radius) {
		super();
		this.centerPoint = centerPoint;
		this.radius = radius;
	}
	public Point getCenterPoint() {
		return centerPoint;
	}
	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [centerPoint=" + centerPoint + ", radius=" + radius + "]";
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

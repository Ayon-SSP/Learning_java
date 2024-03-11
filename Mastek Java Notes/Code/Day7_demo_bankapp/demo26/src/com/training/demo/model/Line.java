package com.training.demo.model;

public class Line extends Shape {
	
	private int pointA;
	private int pointB;
	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Line(String shapeName) {
		super(shapeName);
		// TODO Auto-generated constructor stub
	}
	public Line(String shapeName,int pointA, int pointB) {
		super(shapeName);
		this.pointA = pointA;
		this.pointB = pointB;
	}
	public int getPointA() {
		return pointA;
	}
	public void setPointA(int pointA) {
		this.pointA = pointA;
	}
	public int getPointB() {
		return pointB;
	}
	public void setPointB(int pointB) {
		this.pointB = pointB;
	}
	@Override
	public String toString() {
		return "Line [shapeName=" +this.getShapeName()  + ",pointA=" + pointA + ", pointB=" + pointB + "]";
	}
	@Override
	public String draw() {

		return this.toString();
	}
	
	
}

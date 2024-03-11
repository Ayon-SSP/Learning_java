package com.training.demo.model;

public abstract class Shape {

	private String shapeName;
	
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

//	public String draw() {
//		return shapeName+" Drawn!";
//	}
	
	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	@Override
	public String toString() {
		return "Shape [shapeName=" + shapeName + "]";
	}
	
	public abstract String draw();
}

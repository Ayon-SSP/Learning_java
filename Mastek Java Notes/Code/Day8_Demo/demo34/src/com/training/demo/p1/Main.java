package com.training.demo.p1;

import com.training.demo.p1.Shape.ShapeType;

public class Main {

	public static void main(String[] args) {
		Shape shape=null;
		ShapeType shapeType=ShapeType.CIRCLE;
		shape=new Shape(shapeType);
		shape.setRadius(10);
		System.out.println(shape.calcualteArea());
		
		shapeType=ShapeType.TRIANGLE;
		shape=new Shape(shapeType);
		shape.setLength(10);
		shape.setWidth(10);
		System.out.println(shape.calcualteArea());
		
		shapeType=ShapeType.RECTANGLE;
		shape=new Shape(shapeType);
		shape.setLength(10);
		shape.setWidth(10);
		System.out.println(shape.calcualteArea());
	}

}

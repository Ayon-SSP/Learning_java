package com.training.demo;

import com.training.demo.model.Circle;
import com.training.demo.model.Line;
import com.training.demo.model.Point;

public class Main {

	public static void main(String[] args) {
		Point pointA=new Point(10,20);
		Point pointB=new Point(20,30);
//		System.out.println(pointA);
//		System.out.println(pointB);
		Line line1=new Line(pointA,pointB);
		System.out.println(line1);
		
		Circle circle=new Circle(pointA,10);
		System.out.println(circle);
		System.out.println(circle.getArea());
	}

}

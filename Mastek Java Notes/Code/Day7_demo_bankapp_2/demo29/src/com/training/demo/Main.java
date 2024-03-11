package com.training.demo;

import com.training.demo.model.Circle;
import com.training.demo.model.IShape;
import com.training.demo.model.Square;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Working with Interface");
		IShape shape=null;
		shape=new Circle();
		System.out.println(shape.draw());
		shape=new Square();
		System.out.println(shape.draw());
	}
}

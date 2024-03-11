package com.training.demo;

public class Main {

//	static final int Circle = 0;
//	static final int Triangle = 1;
//	static final int Rectangle = 2;
	public static void main(String[] args) {
		enum ShapeType {CIRCLE, TRIANGLE, RECTANGLE	};
		
		ShapeType shapeType=ShapeType.CIRCLE;
		switch(shapeType) {
		case CIRCLE:
				System.out.println("Selected circle shape");break;
		case TRIANGLE:
			System.out.println("Selected Triangle shape");break;
		case RECTANGLE:
			System.out.println("Selected Rectangle shape");break;
		default:
			System.out.println("Not selected shape");break;				
		
		}
	}
}

//shape Circle,Triangle,Rectangle
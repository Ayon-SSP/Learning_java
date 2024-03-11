package com.training.demo;

public class Main {

	public static void main(String[] args) {
		double result=0;
		Calculator calculator=new Calculator();
		//CONSTANT
//		final int RESULT=calculator.add(100, 200);
//		System.out.println("Result is :"+RESULT);
		
		
		result=calculator.add(100, 200);//CONSTANT
		System.out.println("Addition Result is :"+result);
		
//		result=calculator.sub(100, 200);//CONSTANT
//		System.out.println("Subtraction Result is :"+result);
		
//		result=calculator.mul(100, 200);//CONSTANT
//		System.out.println("Multiplication Result is :"+result);
		
//		result=calculator.div(100, 200);//CONSTANT
//		System.out.println("Division Result is :"+result);
	}

}

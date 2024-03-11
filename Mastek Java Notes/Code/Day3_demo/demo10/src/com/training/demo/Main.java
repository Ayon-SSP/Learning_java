package com.training.demo;
//Primitive type array : int
public class Main {

	public static void main(String[] args) {
		
		//Array is similar type of variables access using index number
		//Aray is an object in Java
		int []number=new int[5]; //1 dimension
		System.out.println("number[0]="+number[0]);
		System.out.println("iterate over array using forloop");
		//loop fix size data -> for
		for (int i=0;i<5;i++) {
			System.out.println("number["+i+"]="+number[i]);
		}
		
		System.out.println("iterate over array using Enhanced forloop");
		for(int num : number) {
			System.out.println(num);
		}

	}

}

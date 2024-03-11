package com.training.demo;

public class Main {

	public static void main(String[] args) {
		//local variable 
		int num1=10;
		int num2=20;
		int result =num1+num2;
		System.out.println("From main function ");
		System.out.println(num1+"+"+num2+"="+result);
		System.out.println("Calling add function: ");
		
		//to call below non static method 
		Main main=new Main();
		main.add(num1,num2);

	}
	public  void add(int num1,int num2) {
		num1=(num1*10);//100
		num2=(num2*10);//200
		int result =num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
	}
	

}
//System.out.println(num1+"+"+num2+"="+result);
//sysout "" indicates message 
//num1,num2 and result will print dynamic values
//to run java file ctr+f11

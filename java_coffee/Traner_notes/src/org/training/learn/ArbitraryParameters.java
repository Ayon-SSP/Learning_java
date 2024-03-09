package org.training.learn;

public class ArbitraryParameters {

	public static void main(String... args) {
		boolean result=isString("This is a test");
		System.out.println("Result: "+result);
		result=isNumber(123);
		System.out.println("Result: "+result);
		
//		Arbitrary Number of Arguments
//		Sum of numbers
		System.out.println("Passing 5 values");
		System.out.println(sum(1,2,3,4,5));
		System.out.println("Passing 10 values");
		System.out.println(sum(1,2,3,4,5,6));
		System.out.println(sum(1,2,3,4,5,6,7));
		System.out.println(sum(1,2,3,4,5,6,7,8));
		System.out.println(sum(1,2,3,4,5,6,7,8,9));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
		System.out.println(sum("Sum of 10 numbers",1,2,3,4,5,6,7,8,9,10));
		int [] numbers= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sumwithArray(numbers, "First argument is array"));
		System.out.println(sumwithArray("Second argument is array",numbers));
		
	}
	private static int sumwithArray(String msg,int[] numbers) {
		int sum=0;
		for(int i:numbers) {
			sum=sum+i;
		}
		System.out.println(msg);
		return sum;
	}
	private static int sumwithArray(int[] numbers,String msg) {
		int sum=0;
		for(int i:numbers) {
			sum=sum+i;
		}
		System.out.println(msg);
		return sum;
	}
	private static int sum(String msg,int... numbers) {
		int sum=0;
		for(int i:numbers) {
			sum=sum+i;
		}
		System.out.println(msg);
		return sum;
	}

	private static int sum(int... numbers) {
		int sum=0;
		for(int i:numbers) {
			sum=sum+i;
		}
		return sum;
	}
//	can be written as below
//	private static int sum(int [] numbers) {
//		int sum=0;
//		for(int i:numbers) {
//			sum=sum+i;
//		}
//		return sum;
//	}
	private static boolean isString(String string) {
		
		return false;
	}
	private static boolean isNumber(int i) {
		
		return false;
	}

}

//comm is null : whenever function returns boolean
// the name of the function should be starting with
//public boolean is<name>([params]){}
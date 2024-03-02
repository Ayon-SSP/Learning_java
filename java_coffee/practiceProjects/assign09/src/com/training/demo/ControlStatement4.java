package com.training.demo;

/*
 * 04. Develop a program to calculate the factorial of a non-negative number entered by the user using a loop (e.g., for, while). 
 */
public class ControlStatement4 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }

}

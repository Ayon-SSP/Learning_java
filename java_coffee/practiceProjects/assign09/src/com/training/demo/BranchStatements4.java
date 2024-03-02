package com.training.demo;

/*
 * 04. Implement a program that calculates the simple interest based on principal, rate, and time using a nested if statement to check for valid input.
 */
public class BranchStatements4 {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        double time = 2;
        if (principal < 0) {
            System.out.println("Principal cannot be negative.");
        } else if (rate < 0) {
            System.out.println("Rate cannot be negative.");
        } else if (time < 0) {
            System.out.println("Time cannot be negative.");
        } else {
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple interest is " + simpleInterest);
        }
    }

}

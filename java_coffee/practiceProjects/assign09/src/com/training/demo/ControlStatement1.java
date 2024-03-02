package com.training.demo;

/*
 * 01. Write a program to accept a grade as input from the user and print the corresponding letter grade (A, B, C, D, F) using an if-else if-else chain.
 */
public class ControlStatement1 {
    public static void main(String[] args) {
        
        for (String arg : args) {
            int grade = Integer.parseInt(arg);
            if (grade >= 90) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 70) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }

}

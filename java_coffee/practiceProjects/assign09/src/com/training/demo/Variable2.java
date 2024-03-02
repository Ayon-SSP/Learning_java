package com.training.demo;

/*
 * 02. Write a program to swap the values of two integer variables without using a temporary variable.
*/
public class Variable2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; // a = 30
        b = a - b; // b = 30 - 20 = 10
        a = a - b; // a = 30 - 10 = 20
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

}

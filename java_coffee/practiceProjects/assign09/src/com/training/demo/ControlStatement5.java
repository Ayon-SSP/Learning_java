package com.training.demo;

/*
 * 05. Write a program that prints the first 10 even numbers using a loop and the % operator to check for evenness.
 */
public class ControlStatement5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}

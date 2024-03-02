package com.training.demo;

/*
 * 02. Create a program that uses a continue statement to skip even numbers when printing the numbers from 1 to 10 in a loop.
 */
public class BranchStatements2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}

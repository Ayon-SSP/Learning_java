package com.training.demo;

/*
 * 04. Develop a program that prints a triangle of numbers in ascending order, with the number of rows entered by the user.
 */
public class LoopingStatements4 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}

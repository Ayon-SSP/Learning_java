package com.training.demo;

import java.util.Scanner;

/*
 * 03. Write a program that allows the user to enter numbers until they enter a negative number, and then print the sum of all the positive numbers entered.
 */
public class LoopingStatements3 {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter numbers (enter a negative number to stop):");

            do {
                System.out.print("Enter a number: ");
                number = sc.nextInt();

                if (number >= 0) {
                    sum += number;
                }

            } while (number >= 0);
        }
        System.out.println("Sum of positive numbers entered: " + sum);

    }

}

package com.training.demo;

import java.util.Scanner;

/*
* 03. Develop a program that checks if a number entered by the user is prime using a loop and a break statement to exit once primality is determined.
*/
public class BranchStatements3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number to check if it's prime (enter 0 to exit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Exiting the program");
                break;
            }

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

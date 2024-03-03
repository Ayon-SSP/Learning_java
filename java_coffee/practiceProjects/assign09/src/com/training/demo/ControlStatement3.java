package com.training.demo;

import java.util.Scanner;
/*
 * 03. Simulate a simple ATM program using a loop that allows the user to withdraw money (within their account limit) until they choose to exit.
 */
public class ControlStatement3 {

    public static void main(String[] args) {
        double accbalance = 10000;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to withdraw");
            System.out.println("Press 3 to deposit");
            System.out.println("Press 4 to exit");
            System.out.print("Enter your choice (1, 2, 3, or 4):");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + accbalance);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount > 0 && withdrawAmount <= accbalance) {
                        accbalance -= withdrawAmount;
                        System.out.println("Remaining balance: " + accbalance);
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 3:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount > 0) {
                        accbalance += depositAmount;
                        System.out.println("Updated balance: " + accbalance);
                    } else {
                        System.out.println("Invalid deposit amount");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

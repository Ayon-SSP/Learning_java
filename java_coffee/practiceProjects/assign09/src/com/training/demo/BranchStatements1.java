package com.training.demo;

/*
 * 01. Write a program that uses a break statement to exit a loop when the user enters the letter 'q'.
 */
public class BranchStatements1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Enter a letter (enter 'q' to exit): ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.out.println("Exiting the program");
                break;
            }
        }
        scanner.close();
    }

}

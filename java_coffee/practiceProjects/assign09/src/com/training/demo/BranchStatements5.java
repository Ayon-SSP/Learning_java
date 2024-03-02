package com.training.demo;

/*
 * 05. Create a program that displays a different message based on the user's age using a series of if statements or a switch statement.
 */
public class BranchStatements5 {
    public static void main(String[] args) {
        int age = 20;
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }
    }

}

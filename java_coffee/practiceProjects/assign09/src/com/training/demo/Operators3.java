package com.training.demo;
/*
 * 03. Use logical operators (&&, ||, !) to check if a number is even or odd and print the appropriate message.
 */
public class Operators3 {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0 && number > 0) {
            System.out.println(number + " is even");
        } else if (number % 2 != 0 || 1 != 0){
            System.out.println(number + " is odd");
        }
    }
}

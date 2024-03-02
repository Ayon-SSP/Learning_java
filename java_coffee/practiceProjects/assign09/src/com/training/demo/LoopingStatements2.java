package com.training.demo;
/*
 * 02. Create a program that displays the first 15 Fibonacci numbers using a while loop.
 */
public class LoopingStatements2 {
    public static void main(String[] args) {
        int n = 15, firstTerm = 0, secondTerm = 1;
        System.out.println("First " + n + " terms: ");
        int i = 1;
        while (i <= n) {
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
    }
}

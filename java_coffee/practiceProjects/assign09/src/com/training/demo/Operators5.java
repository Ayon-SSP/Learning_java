package com.training.demo;
/*
 * 05. *Apply the assignment operator (=) and its variations (+=, -=, =, /=, %=, <<=, >>=, >>>=) to modify a variable's value and print the result.
 */
public class Operators5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += b; // a = a + b
        System.out.println("a += b = " + a);
        a -= b; // a = a - b
        System.out.println("a -= b = " + a);
        a *= b; // a = a * b
        System.out.println("a *= b = " + a);
        a /= b; // a = a / b
        System.out.println("a /= b = " + a);
        a %= b; // a = a % b
        System.out.println("a %= b = " + a);
        a <<= 2; // a = a << 2
        System.out.println("a <<= 2 = " + a);
        a >>= 2; // a = a >> 2
        System.out.println("a >>= 2 = " + a);
        a >>>= 2; // a = a >>> 2
        System.out.println("a >>>= 2 = " + a);
    }

}

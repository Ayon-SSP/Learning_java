package com.training.demo;
/*
 * 04. Illustrate the bitwise operators (&, |, ^, ~, <<, >>, >>>) on two integers and print the results.
 */
public class Operators4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a & b = " + (a & b)); // 0000 1010 & 0001 0100 = 0000 0000
        System.out.println("a | b = " + (a | b)); // 0000 1010 | 0001 0100 = 0001 1110
        System.out.println("a ^ b = " + (a ^ b)); // 0000 1010 ^ 0001 0100 = 0001 1110
        System.out.println("~a = " + ~a); // ~0000 1010 = 1111 0101
        System.out.println("a << 2 = " + (a << 2)); // 0000 1010 << 2 = 0010 1000
        System.out.println("a >> 2 = " + (a >> 2)); // 0000 1010 >> 2 = 0000 0010
        System.out.println("a >>> 2 = " + (a >>> 2)); // 0000 1010 >>> 2 = 0000 0010
    }
}

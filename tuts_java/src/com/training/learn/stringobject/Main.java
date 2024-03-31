package com.training.learn.stringobject;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello"; // s1 -> "Hello"
        String s2 = "Hello"; // s2 -> "Hello"
        String s3 = new String("Hello"); // s3 -> "Hello"
        String s4 = new String("Hello"); // s3 -> "Hello"

        // System.out.println(s1.hashCode() + " \n" + s2.hashCode() + " \n" + s3.hashCode());
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3 == s4); // false

    }
}

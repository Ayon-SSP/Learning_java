package com.training.demo;

/*
 * 05. Declare two variables and check if they are of the same data type using the instanceof operator.

*/
// create a class MyType
class MyType {
    int a;
    double b;
}

public class Variable5 {
    public static void main(String[] args) {
        Integer fooInteger = 336;
        // string put null
        String fooString = null;
        MyType fooMyType = new MyType();
        System.out.println("fooInteger is an instance of Integer: " + (fooInteger instanceof Integer));
        System.out.println("fooInteger is an instance of Integer: " + (fooString instanceof String));
        System.out.println("a is an instance of Integer: " + (fooMyType instanceof MyType));
    }

}

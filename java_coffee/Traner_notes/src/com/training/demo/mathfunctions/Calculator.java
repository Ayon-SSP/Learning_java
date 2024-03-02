package com.training.demo.mathfunctions;

public class Calculator {

    // default constructor : SHORTCUT: alt + S, C
    // Overloaded constructor/parameterized constructor: SHORTCUT: alt + S, A
    // Overloading constructor
    // getter/setter - field/instance variables

    public Calculator() {
        System.out.println("Calculator()");
    }
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}

package com.training.learn.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Calculator {
    int calculate(int a, int b);
}

public class LambdaFilters {

    public static void main(String[] args) {
        Calculator addition = (int a, int b) -> a + b;
        Calculator subtraction = (int a, int b) -> a - b;
        Calculator multiplication = (int a, int b) -> a * b;
        Calculator division = (int a, int b) -> a / b;
        
        System.out.println("Addition: " + addition.calculate(10, 5));
        System.out.println("Subtraction: " + subtraction.calculate(10, 5));
        System.out.println("Multiplication: " + multiplication.calculate(10, 5));
        System.out.println("Division: " + division.calculate(10, 5));

        
        List<String> names = new ArrayList<>(Arrays.asList("J", "Doe", "Jane", "Doe", "Adam", "bigestname"));
        names.sort((String s1, String s2) -> s1.length() - s2.length());
        
        // Print the sorted list
        System.out.println("Sorted list by length: " + names);
    }
}


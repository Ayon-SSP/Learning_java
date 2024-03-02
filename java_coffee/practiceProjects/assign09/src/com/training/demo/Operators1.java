package com.training.demo;
/*
 * 01. Write a program to calculate the area and perimeter of a rectangle given its length and width using arithmetic operators (+, -, , /).
 */
public class Operators1 {
    public static void main(String[] args) {
        int length = 10;
        int width = 20;
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

}

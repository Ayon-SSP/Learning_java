package com.training.learn.polymorphism;

/*
 * Dynamic Method Dispatch(DMD) is a mechanism by which a call to an overridden method is resolved at runtime, rather than compile time.
 */

// Shape Class
class Shape {
    public double getArea() {
        return 0;
    }

    public void display() {
        System.out.println("This is a shape");
    }
}

// A Rectangle is a Shape
class Rectangle extends Shape { // extended form the Shape class

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public void display() {
        System.out.println("This is a Rectangle");
    }

    public void onlyRectangle() {
        System.out.println("This is only Rectangle");
    }

}

// A Circle is a Shape
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.13 * this.radius * this.radius;
    }

    // public void display() {
    //     System.out.println("This is a Circle");
    // }

    public static void main(String args[]) {
        Shape[] shape = new Shape[2]; // Creating the shape array of size 2

        shape[0] = new Circle(3); // creating the circle object at index 0
        shape[1] = new Rectangle(2, 3); // creating the rectangle object at index 1

        System.out.println("Area of Circle: " + shape[0].getArea());
        System.out.println("Area of Rectangle: " + shape[1].getArea());
        // System.out.println(shape[1].onlyRectangle()); // Error: onlyRectangle() method is not available in Shape class
    }

}
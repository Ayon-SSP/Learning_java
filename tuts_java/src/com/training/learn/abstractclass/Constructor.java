package com.training.learn.abstractclass;

abstract class Shape {
    int x, y;

    // Constructor
    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method
    abstract void draw();
}

class Circle extends Shape {
    int radius;

    // Constructor
    Circle(int x, int y, int radius) {
        super(x, y); // Call to constructor of the abstract class
        this.radius = radius;
    }

    // Implementation of abstract method
    void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 20, 30);
        circle.draw(); // Output: Drawing a circle at (10, 20) with radius 30
    }
}

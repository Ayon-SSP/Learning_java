package com.training.learn.inheritance.shapes;

import com.training.learn.inheritance.shapes.model.*;

public class Main {
    public static void main(String[] args) {
        // Create a point
        Point p1 = new Point(1, 2);
        System.out.println(p1);

        // Create a circle
        Circle c1 = new Circle(p1, 5);
        System.out.println(c1);

        // Create a line
        Point p2 = new Point(1, 3);
        Line l1 = new Line(p1, p2);
        System.out.println(l1);

        // 
    }
}

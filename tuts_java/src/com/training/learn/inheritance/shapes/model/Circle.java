package com.training.learn.inheritance.shapes.model;

public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        super();
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getters and setters
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    // toString
    @Override
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + "]";
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (center == null) {
            if (other.center != null)
                return false;
        } else if (!center.equals(other.center))
            return false;
        if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
            return false;
        return true;
    }

}

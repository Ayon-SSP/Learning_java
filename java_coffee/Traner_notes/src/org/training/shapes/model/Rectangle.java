package org.training.shapes.model;

public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle() {
        super();
        // this.topLeft = new Point();
        // this.bottomRight = new Point();
        // this(topLeft, bottomRight);
    }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and setters
    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    // toString
    @Override
    public String toString() {
        return "Rectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    public double getArea() {
        return (bottomRight.getX() - topLeft.getX()) * (topLeft.getY() - bottomRight.getY());
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
        Rectangle other = (Rectangle) obj;
        if (bottomRight == null) {
            if (other.bottomRight != null)
                return false;
        } else if (!bottomRight.equals(other.bottomRight))
            return false;
        if (topLeft == null) {
            if (other.topLeft != null)
                return false;
        } else if (!topLeft.equals(other.topLeft))
            return false;
        return true;
    }

}

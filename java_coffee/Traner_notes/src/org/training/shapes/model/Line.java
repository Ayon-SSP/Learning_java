package org.training.shapes.model;

public class Line {
    private Point start;
    private Point end;

    public Line() {
        super();
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Getters and setters
    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // toString
    @Override
    public String toString() {
        return "Line [start=" + start + ", end=" + end + "]";
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
        Line other = (Line) obj;
        if (end == null) {
            if (other.end != null)
                return false;
        } else if (!end.equals(other.end))
            return false;
        if (start == null) {
            if (other.start != null)
                return false;
        } else if (!start.equals(other.start))
            return false;
        return true;
    }

}

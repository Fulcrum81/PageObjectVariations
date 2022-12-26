package org.example.shapes;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
        shapeName = "Square";
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

}

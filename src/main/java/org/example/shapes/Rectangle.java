package org.example.shapes;

public class Rectangle extends Shape {
    double sizeA;
    double sizeB;

    public Rectangle (double sizeA, double sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        shapeName = "Rectangle";
    }

    public void setSizeA(double sizeA) {
        this.sizeA = sizeA;
    }

    public void setSizeB(double sizeB) {
        this.sizeB = sizeB;
    }

    public double getSizeA() {
        return sizeA;
    }

    public double getSizeB() {
        return sizeB;
    }

    @Override
    public double getArea() {
        return Math.abs(sizeA * sizeB);
    }

}

package org.example.shapes;

public abstract class Shape {
    protected String shapeName;
    public abstract double getArea();

    public String getShapeName() {
        return "I am a " + shapeName;
    }
}

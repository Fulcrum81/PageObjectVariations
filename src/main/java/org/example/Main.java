package org.example;

import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Shape;
import org.example.shapes.Square;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!"); // Эта строка кода выводит в консоль надпись "Hello World!"
        Circle circle15 = new Circle(15);
        Square square25 = new Square(25);
        Rectangle rectangle30by54 = new Rectangle(30, 54);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println(shape.getShapeName());
        System.out.println("the shape area is: " + shape.getArea());
    }

    public static double divide(int a, int b) {
        return a / b;
    }
}
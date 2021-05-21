package com.geometry;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5, 5);
        Rectangle rectangle = new Rectangle(5, 5);

        GeometricFigure[] figures = { circle, triangle, rectangle };

        System.out.println(GeometricUtils.mediumArea(figures));
    }
}

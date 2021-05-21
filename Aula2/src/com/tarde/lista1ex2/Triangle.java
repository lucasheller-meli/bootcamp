package com.tarde.lista1ex2;

public class Triangle extends GeometricFigure {
    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return base * height / 2;
    }
}

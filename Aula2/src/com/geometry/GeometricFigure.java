package com.geometry;

public abstract class GeometricFigure {
    public abstract double area();

    // makes no sense
    @Override
    public String toString() {
        return super.toString();
    }
}

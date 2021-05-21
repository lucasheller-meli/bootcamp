package com.tarde.lista1ex2;

public abstract class GeometricFigure {
    public abstract double area();

    // makes no sense
    @Override
    public String toString() {
        return super.toString();
    }
}

package com.tarde.lista1ex2;

import java.util.Arrays;

public class GeometricUtils {
    public static double mediumArea (GeometricFigure[] figures) {
        return Arrays.stream(figures).map(GeometricFigure::area).reduce(0.0, Double::sum) / figures.length;
    }
}

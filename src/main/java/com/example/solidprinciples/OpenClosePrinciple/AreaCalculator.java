package com.example.solidprinciples.OpenClosePrinciple;

import java.awt.geom.Area;
import java.util.List;

public class AreaCalculator {
    public double getSumOfAreas(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}

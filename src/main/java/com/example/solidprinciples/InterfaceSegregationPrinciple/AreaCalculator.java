package com.example.solidprinciples.InterfaceSegregationPrinciple;

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

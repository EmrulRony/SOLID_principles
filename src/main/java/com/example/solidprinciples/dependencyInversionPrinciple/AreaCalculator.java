package com.example.solidprinciples.dependencyInversionPrinciple;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    @Override
    public double getSumOfAreas(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}

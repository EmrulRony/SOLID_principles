package com.example.solidprinciples.openClosePrincipleViolation;

import java.util.List;

public class AreaCalculator {
    public double getSumOfAreas(List<Object> shapes) {
        int sum = 0;
        for (Object shape : shapes) {
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            } else if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
        }
        return sum;
    }
}

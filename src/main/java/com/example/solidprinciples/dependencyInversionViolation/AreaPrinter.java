package com.example.solidprinciples.dependencyInversionViolation;

import java.util.List;

public class AreaPrinter {

    private final AreaCalculator areaCalculator = new AreaCalculator();

    public String json(List<Shape> shapes) {
        return "{sum: %s}".formatted(areaCalculator.getSumOfAreas(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "sum, %s".formatted(areaCalculator.getSumOfAreas(shapes));
    }
}

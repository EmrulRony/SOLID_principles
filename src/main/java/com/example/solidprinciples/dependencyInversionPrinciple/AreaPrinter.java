package com.example.solidprinciples.dependencyInversionPrinciple;

import java.util.List;

public class AreaPrinter {

    private final IAreaCalculator areaCalculator;

    public AreaPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return "{sum: %s}".formatted(areaCalculator.getSumOfAreas(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "sum, %s".formatted(areaCalculator.getSumOfAreas(shapes));
    }
}

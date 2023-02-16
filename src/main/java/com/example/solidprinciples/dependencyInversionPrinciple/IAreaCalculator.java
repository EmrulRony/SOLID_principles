package com.example.solidprinciples.dependencyInversionPrinciple;

import java.util.List;

public interface IAreaCalculator {
    double getSumOfAreas(List<Shape> shapes);
}

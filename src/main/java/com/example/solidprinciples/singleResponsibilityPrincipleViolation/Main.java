package com.example.solidprinciples.singleResponsibilityPrincipleViolation;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle, square);
        var sum = areaCalculator.getSumOfAreas(shapes);
        System.out.println("Sum = " + sum);
        System.out.println(areaCalculator.json(shapes));
    }
}

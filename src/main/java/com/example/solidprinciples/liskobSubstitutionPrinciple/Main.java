package com.example.solidprinciples.liskobSubstitutionPrinciple;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        AreaPrinter areaPrinter = new AreaPrinter();
        Shape circle = new Circle(10);
        Shape square = new Square(10);
        Shape cube = new Cube(5);
        NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square, cube, noShape); // Will throw IllegalArgumentException
        var sum = areaCalculator.getSumOfAreas(shapes);
        System.out.println("Sum = " + sum);
        System.out.println(areaPrinter.json(sum));
        System.out.println(areaPrinter.csv(sum));
    }
}

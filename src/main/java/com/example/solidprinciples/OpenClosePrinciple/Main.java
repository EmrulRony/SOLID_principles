package com.example.solidprinciples.OpenClosePrinciple;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        AreaPrinter areaPrinter = new AreaPrinter();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(5);
        List<Shape> shapes = List.of(circle, square, cube);
        var sum = areaCalculator.getSumOfAreas(shapes);
        System.out.println("Sum = " + sum);
        System.out.println(areaPrinter.json(sum));
        System.out.println(areaPrinter.csv(sum));
    }
}

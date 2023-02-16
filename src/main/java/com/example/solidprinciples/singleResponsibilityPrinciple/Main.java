package com.example.solidprinciples.singleResponsibilityPrinciple;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        AreaPrinter areaPrinter = new AreaPrinter();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle, square);
        double sum = areaCalculator.getSumOfAreas(shapes);
        System.out.println("Sum = " + sum);
        System.out.println(areaPrinter.json(sum));;
        System.out.println(areaPrinter.csv(sum));;
    }
}

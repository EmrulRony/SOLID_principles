package com.example.solidprinciples.InterfaceSegregationPrinciple;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        VolumeCalculator volumeCalculator = new VolumeCalculator();
        AreaPrinter areaPrinter = new AreaPrinter();
        Shape circle = new Circle(10);
        Shape square = new Square(10);
        ThreeDimensionalShape cube = new Cube(5);
        List<Shape> shapes = List.of(circle, square, cube);
        var sum = areaCalculator.getSumOfAreas(shapes);
        System.out.println("Sum of areas = " + sum);
        System.out.println(areaPrinter.json(sum));
        System.out.println(areaPrinter.csv(sum));
        var sumOfVolumes = volumeCalculator.getSumOfVolumes(List.of(cube));
        System.out.println("Sum of volumes = " + sumOfVolumes);

    }
}

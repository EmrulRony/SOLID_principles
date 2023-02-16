package com.example.solidprinciples.OpenClosePrinciple;

public class Cube implements Shape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(side, 2);
    }
}

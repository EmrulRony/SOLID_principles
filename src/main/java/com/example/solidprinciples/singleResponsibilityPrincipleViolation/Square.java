package com.example.solidprinciples.singleResponsibilityPrincipleViolation;

public class Square {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}

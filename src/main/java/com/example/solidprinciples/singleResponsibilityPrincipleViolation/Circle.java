package com.example.solidprinciples.singleResponsibilityPrincipleViolation;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
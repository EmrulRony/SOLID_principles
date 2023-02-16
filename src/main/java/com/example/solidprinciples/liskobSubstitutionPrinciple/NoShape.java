package com.example.solidprinciples.liskobSubstitutionPrinciple;

public class NoShape implements Shape {

    public NoShape() {
    }

    @Override
    public double getArea() {
        throw new IllegalArgumentException();
    }
}

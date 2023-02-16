package com.example.solidprinciples.InterfaceSegregationPrinciple;

import java.util.List;

public class VolumeCalculator {
    public double getSumOfVolumes(List<ThreeDimensionalShape> shapes) {
        int sum = 0;
        for (var shape : shapes) {
            sum += shape.getVolume();
        }
        return sum;
    }
}

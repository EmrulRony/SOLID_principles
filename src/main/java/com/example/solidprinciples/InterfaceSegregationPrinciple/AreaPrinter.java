package com.example.solidprinciples.InterfaceSegregationPrinciple;

import java.util.List;

public class AreaPrinter {

    public String json(double sum) {
        return "{sum: %s}".formatted(sum);
    }

    public String csv(double sum) {
        return "sum, %s".formatted(sum);
    }
}

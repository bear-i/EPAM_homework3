package com.epam.Composite;

public class Numeric implements Operation {
    double value;

    public Numeric(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value;
    }
}

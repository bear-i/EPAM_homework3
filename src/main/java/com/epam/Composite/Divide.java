package com.epam.Composite;

public class Divide implements  Operation {
    Operation left;
    Operation right;

    public Divide(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate() {
        return left.calculate()/right.calculate();
    }
}

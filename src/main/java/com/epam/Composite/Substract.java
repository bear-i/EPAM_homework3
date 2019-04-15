package com.epam.Composite;

public class Substract implements Operation {
    Operation left;
    Operation right;

    public Substract(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate() {
        return left.calculate() - right.calculate();
    }
}

package com.epam.Composite;

public class Add implements Operation {
    Operation left;
    Operation right;

    public Add(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate() {
        return left.calculate()+right.calculate();
    }
}

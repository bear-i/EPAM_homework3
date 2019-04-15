package com.epam.Composite;

public class Multiply  implements Operation{
    Operation left;
    Operation right;

    public Multiply(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }

    public double calculate() {
        return left.calculate()*right.calculate();
    }
}

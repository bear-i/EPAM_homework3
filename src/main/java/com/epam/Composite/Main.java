package com.epam.Composite;

public class Main {
    public static void main(String[] args) {
        //(1+2)*4+5*(3+6)
        Operation operation = new Add(
           new Multiply(
                   new Add(new Numeric(1), new Numeric(2)),
                   new Numeric(4)
           ),
           new Multiply(
                   new Numeric(5),
                   new Add(new Numeric(3), new Numeric(6))
           )
        );

        double result = operation.calculate();
        System.out.println(result);
    }
}

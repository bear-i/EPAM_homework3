package com.epam.Strategy.strategies;

public class Flying implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("I am flying");
    }
}

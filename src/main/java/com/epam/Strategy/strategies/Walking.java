package com.epam.Strategy.strategies;

public class Walking implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("I am walking");
    }
}

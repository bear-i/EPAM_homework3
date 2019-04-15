package com.epam.Strategy.strategies;

public class Running implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("I am running");
    }
}

package com.epam.Strategy.strategies;

public class Stalking implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("I am stalking");
    }
}

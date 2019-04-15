package com.epam.Strategy.strategies;

public class FlyUsingMagic implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("We're flying using magic");
    }
}

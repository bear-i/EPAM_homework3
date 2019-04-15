package com.epam.Flyweight;

public class Bacterium {
    private int length;
    private BacteriumType bacteriumType;

    public Bacterium(BacteriumType bacteriumType) {
        this.length = 1;
        this.bacteriumType = bacteriumType;
    }

    public void grow(){
        bacteriumType.grow(length);
    }
}

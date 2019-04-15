package com.epam.Flyweight;
import java.util.ArrayList;

public class Colony {
    BacteriumType bacteriumType;
    ArrayList<Bacterium> bacteriumColony = new ArrayList<>(500_000_000);

    public Colony(BacteriumType bacteriumType) {
        this.bacteriumType = bacteriumType;
        bacteriumColony.add(new Bacterium(bacteriumType));
    }

    public void reproduction() {
        bacteriumDivide();
    }

    private void bacteriumDivide() {
        int size = bacteriumColony.size();
        int dividedColonySize = size * 2;
        while (size != dividedColonySize) {
            bacteriumColony.add(new Bacterium(bacteriumType));
            size++;
        }
    }

    public BacteriumType getBacteriumType() {
        return bacteriumType;
    }

    public void setBacteriumType(BacteriumType bacteriumType) {
        this.bacteriumType = bacteriumType;
    }

    public ArrayList<Bacterium> getBacteriumColony() {
        return bacteriumColony;
    }

    public void setBacteriumColony(ArrayList<Bacterium> bacteriumColony) {
        this.bacteriumColony = bacteriumColony;
    }

    public int getSizeOfColony() {
        return bacteriumColony.size();
    }
}

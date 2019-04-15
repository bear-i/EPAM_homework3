package com.epam.FactoryMethod.creators;

import com.epam.FactoryMethod.superFigure.*;

public class SuperFigureCreator implements FigureCreator {

    @Override
    public SuperFigure createFigure() {
        int random = (int) Math.round((Math.random() * 10));
        switch (random) {
            case 1:
                return new SuperTFigure();
            case 2:
                return new SuperIFigure();
            case 3:
                return new SuperJFigure();
            case 4:
                return new SuperLFigure();
            case 5:
                return new SuperQFigure();
            case 6:
                return new SuperSFigure();
            case 7:
                return new SuperZFigure();
            default:
                return new SuperJFigure();
        }
    }
}

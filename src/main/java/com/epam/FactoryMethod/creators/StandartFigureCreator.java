package com.epam.FactoryMethod.creators;

import com.epam.FactoryMethod.standartFigure.*;

public class StandartFigureCreator implements FigureCreator {

    @Override
    public StandartFigure createFigure() {
        int random = (int) Math.round((Math.random() * 10));
        switch (random) {
            case 1:
                return new StandartTFigure();
            case 2:
                return new StandartIFigure();
            case 3:
                return new StandartJFigure();
            case 4:
                return new StandartLFigure();
            case 5:
                return new StandartQFigure();
            case 6:
                return new StandartSFigure();
            case 7:
                return new StandartZFigure();
            default:
                return new StandartJFigure();
        }
    }
}

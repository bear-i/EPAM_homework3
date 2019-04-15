package com.epam.FactoryMethod.standartFigure;

import com.epam.FactoryMethod.Figure;

public abstract class StandartFigure extends Figure {
    private final String size = "Standart";

    public String getSize() {
        return size;
    }
}

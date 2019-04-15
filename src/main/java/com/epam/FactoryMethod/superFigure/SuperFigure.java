package com.epam.FactoryMethod.superFigure;

import com.epam.FactoryMethod.Figure;

public abstract class SuperFigure extends Figure {
    private final String size = "Large";

    public String getSize() {
        return size;
    }
}

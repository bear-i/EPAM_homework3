package com.epam.AbstractFactory;

import com.epam.AbstractFactory.factory.AbstractFactory;
import com.epam.AbstractFactory.filmTypes.FilmStripCountry;
import com.epam.AbstractFactory.filmTypes.Language;

public class Main {
    public static void main(String[] args) {
        System.out.println(AbstractFactory.doFilm(FilmStripCountry.American, Language.Spanish));
    }
}

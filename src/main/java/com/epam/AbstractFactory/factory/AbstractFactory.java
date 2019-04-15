package com.epam.AbstractFactory.factory;

import com.epam.AbstractFactory.*;
import com.epam.AbstractFactory.filmComponents.FilmStrip;
import com.epam.AbstractFactory.filmComponents.Soundtrack;
import com.epam.AbstractFactory.filmComponents.Subtitles;
import com.epam.AbstractFactory.filmTypes.FilmStripCountry;
import com.epam.AbstractFactory.filmTypes.Language;

public class AbstractFactory {

    public static Film doFilm(FilmStripCountry filmStripCountry, Language language) {
        FilmFactory filmFactory = AbstractFactory.getFilmFactory(filmStripCountry, language);

        FilmStrip filmStrip = filmFactory.doFilmStrip();
        Soundtrack soundtrack = filmFactory.doSoundtrack();
        Subtitles subtitles = filmFactory.doSubtitles();

        Film film = new Film(filmStrip, soundtrack, subtitles);
        return film;
    }

    private static FilmFactory getFilmFactory(FilmStripCountry filmStripCountry, Language language) {
        switch (filmStripCountry) {
            case American:
                return new AmericanFilmFactory(language);
            case Spanish:
                return new SpanishFilmFactory(language);
            case French:
                return new FrenchFilmFactory(language);
            default:
                throw new IllegalArgumentException();
        }
    }
}

package com.epam.AbstractFactory.factory;

import com.epam.AbstractFactory.filmComponents.FilmStrip;
import com.epam.AbstractFactory.filmComponents.Soundtrack;
import com.epam.AbstractFactory.filmComponents.Subtitles;
import com.epam.AbstractFactory.filmComponents.spanish.SpanishFilmStrip;
import com.epam.AbstractFactory.filmTypes.Language;

public class SpanishFilmFactory implements  FilmFactory {
    private Language language;

    public SpanishFilmFactory(Language language) {
        this.language = language;
    }

    @Override
    public FilmStrip doFilmStrip() {
        return new SpanishFilmStrip();
    }

    @Override
    public Soundtrack doSoundtrack() {
        return SoundtrackFactory.getSoundtrack(language);
    }

    @Override
    public Subtitles doSubtitles() {
        return SubtitleFactory.getSubtitles(language);
    }
}

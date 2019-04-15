package com.epam.AbstractFactory.factory;

import com.epam.AbstractFactory.filmComponents.FilmStrip;
import com.epam.AbstractFactory.filmComponents.Soundtrack;
import com.epam.AbstractFactory.filmComponents.Subtitles;
import com.epam.AbstractFactory.filmComponents.french.FrenchFilmStrip;
import com.epam.AbstractFactory.filmTypes.Language;

public class FrenchFilmFactory implements FilmFactory {
    private Language language;

    public FrenchFilmFactory(Language language) {
        this.language = language;
    }

    @Override
    public FilmStrip doFilmStrip()
    {
        return new FrenchFilmStrip();
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

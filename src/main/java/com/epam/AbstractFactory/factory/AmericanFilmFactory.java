package com.epam.AbstractFactory.factory;

import com.epam.AbstractFactory.filmComponents.FilmStrip;
import com.epam.AbstractFactory.filmComponents.Soundtrack;
import com.epam.AbstractFactory.filmComponents.Subtitles;
import com.epam.AbstractFactory.filmComponents.american.AmericanFilmStrip;
import com.epam.AbstractFactory.filmTypes.Language;

public class AmericanFilmFactory implements FilmFactory {
    Language language;

    AmericanFilmFactory(Language language){
        this.language = language;
    }

    @Override
    public FilmStrip doFilmStrip() {
        return new AmericanFilmStrip();
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

package com.epam.AbstractFactory.factory;

import com.epam.AbstractFactory.filmComponents.FilmStrip;
import com.epam.AbstractFactory.filmComponents.Soundtrack;
import com.epam.AbstractFactory.filmComponents.Subtitles;

public interface FilmFactory {
    FilmStrip doFilmStrip();
    Soundtrack doSoundtrack();
    Subtitles doSubtitles();
}

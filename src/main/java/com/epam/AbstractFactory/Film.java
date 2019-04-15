package com.epam.AbstractFactory;

import com.epam.AbstractFactory.filmComponents.FilmStrip;
import com.epam.AbstractFactory.filmComponents.Soundtrack;
import com.epam.AbstractFactory.filmComponents.Subtitles;

public class Film {
    private FilmStrip filmStrip;
    private Soundtrack soundtrack;
    private Subtitles subtitles;

    public Film(FilmStrip filmStrip, Soundtrack soundtrack, Subtitles subtitles){
        this.filmStrip = filmStrip;
        this.soundtrack = soundtrack;
        this.subtitles = subtitles;
    }

    @Override
    public String toString() {
        return "FilmStrip: " + filmStrip + ", soundtrack: " + soundtrack + ", subtitles: " + subtitles;
    }
}

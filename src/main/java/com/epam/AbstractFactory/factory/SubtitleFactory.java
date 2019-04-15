package com.epam.AbstractFactory.factory;

import com.epam.AbstractFactory.filmComponents.Subtitles;
import com.epam.AbstractFactory.filmComponents.american.AmericanSubtitles;
import com.epam.AbstractFactory.filmComponents.french.FrenchSubtitles;
import com.epam.AbstractFactory.filmComponents.spanish.SpanishSubtitles;
import com.epam.AbstractFactory.filmTypes.Language;

public class SubtitleFactory {

    public static Subtitles getSubtitles(Language language){
        switch(language){
            case French:
                return new FrenchSubtitles();
            case Spanish:
                return new SpanishSubtitles();
            case American:
                return new AmericanSubtitles();
            default:
                throw new IllegalArgumentException();
        }
    }
}

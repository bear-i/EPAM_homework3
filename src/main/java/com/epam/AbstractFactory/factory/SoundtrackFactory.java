package com.epam.AbstractFactory.factory;

import com.epam.AbstractFactory.filmComponents.Soundtrack;
import com.epam.AbstractFactory.filmComponents.american.AmericanSoundtrack;
import com.epam.AbstractFactory.filmComponents.french.FrenchSoundtrack;
import com.epam.AbstractFactory.filmComponents.spanish.SpanishSountrack;
import com.epam.AbstractFactory.filmTypes.Language;

public class SoundtrackFactory {

    public static Soundtrack getSoundtrack(Language language){
        switch(language){
            case French:
                return new FrenchSoundtrack();
            case Spanish:
                return new SpanishSountrack();
            case American:
                return new AmericanSoundtrack();
            default: throw  new IllegalArgumentException();
        }
    }
}

package main.java.com.mkaloshyn.structural.composite_08;

import java.util.ArrayList;
import java.util.List;

public class StringEnsemble {

    List<Musician> stringEnsemble = new ArrayList<>();

    public void addMusician (Musician musician) {
        stringEnsemble.add(musician);
    }

    public void removeMusician (Musician musician) {
        stringEnsemble.remove(musician);
    }

    public void playConcert () {
        System.out.println("String ensemble performs The concert for strings of Haydn");
        for(Musician musician: stringEnsemble) {
            musician.playInstrument();
        }
    }
}

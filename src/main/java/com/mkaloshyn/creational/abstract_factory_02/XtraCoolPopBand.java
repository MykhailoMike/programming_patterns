package main.java.com.mkaloshyn.creational.abstract_factory_02;

import main.java.com.mkaloshyn.creational.abstract_factory_02.popBand.PopBandFactory;

import java.util.List;

public class XtraCoolPopBand {

    public static void main(String[] args) {
        MusicalBandFactory musicalBandFactory = new PopBandFactory();
        Soloist soloist = musicalBandFactory.getSoloist();
        BackVocalist backVocalist = musicalBandFactory.getBackVocalist();
        List<Musician> musicians = musicalBandFactory.getMusicians();

        System.out.println("POP band is performing now: ");
        soloist.sing();
        backVocalist.sing();
        for (Musician musician : musicians) {
            musician.play();
        }
    }
}

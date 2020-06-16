package main.java.com.mkaloshyn.creational.abstract_factory_02;

import main.java.com.mkaloshyn.creational.abstract_factory_02.rockBand.RockBandFactory;

import java.util.List;

public class TheUltimateRockBand {

    public static void main(String[] args) {
        MusicalBandFactory musicalBandFactory = new RockBandFactory();
        Soloist soloist = musicalBandFactory.getSoloist();
        BackVocalist backVocalist = musicalBandFactory.getBackVocalist();
        List<Musician> musicians = musicalBandFactory.getMusicians();

        System.out.println("The rock band is performing now: ");
        soloist.sing();
        backVocalist.sing();
        for (Musician musician : musicians) {
            musician.play();
        }
    }
}

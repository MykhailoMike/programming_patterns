package main.java.com.mkaloshyn.creational.abstract_factory_02.rockBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.BackVocalist;
import main.java.com.mkaloshyn.creational.abstract_factory_02.MusicalBandFactory;
import main.java.com.mkaloshyn.creational.abstract_factory_02.Musician;
import main.java.com.mkaloshyn.creational.abstract_factory_02.Soloist;

import java.util.Arrays;
import java.util.List;

public class RockBandFactory implements MusicalBandFactory {
    @Override
    public Soloist getSoloist() {
        return new RockSinger();
    }

    @Override
    public BackVocalist getBackVocalist() {
        return new RockBackVocalist();
    }

    @Override
    public List<Musician> getMusicians() {
        return Arrays.asList(new BassGuitarPlayer(), new SoloGuitarPlayer(), new Drummer());
    }
}

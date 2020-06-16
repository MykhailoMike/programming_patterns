package main.java.com.mkaloshyn.creational.abstract_factory_02.popBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.BackVocalist;
import main.java.com.mkaloshyn.creational.abstract_factory_02.MusicalBandFactory;
import main.java.com.mkaloshyn.creational.abstract_factory_02.Musician;
import main.java.com.mkaloshyn.creational.abstract_factory_02.Soloist;

import java.util.Arrays;
import java.util.List;

public class PopBandFactory implements MusicalBandFactory {
    @Override
    public Soloist getSoloist() {
        return new PopSinger();
    }

    @Override
    public BackVocalist getBackVocalist() {
        return new PopBackVocalist();
    }

    @Override
    public List<Musician> getMusicians() {
        return Arrays.asList(new KeyBoardPlayer(), new GuitarPlayer(), new Percussion());
    }
}

package main.java.com.mkaloshyn.creational.abstract_factory_02;

import java.util.List;

public interface MusicalBandFactory {
    Soloist getSoloist();
    BackVocalist getBackVocalist();
    List<Musician> getMusicians();
}

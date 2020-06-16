package main.java.com.mkaloshyn.creational.abstract_factory_02.popBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.Musician;

public class KeyBoardPlayer implements Musician {
    @Override
    public void play() {
        System.out.println("Key board player plays some pop music");
    }
}

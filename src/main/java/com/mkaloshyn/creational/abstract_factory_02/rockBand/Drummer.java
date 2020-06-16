package main.java.com.mkaloshyn.creational.abstract_factory_02.rockBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.Musician;

public class Drummer implements Musician {

    @Override
    public void play() {
        System.out.println("The drummer plays rock on drums");
    }
}

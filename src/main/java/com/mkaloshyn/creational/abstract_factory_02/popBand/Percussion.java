package main.java.com.mkaloshyn.creational.abstract_factory_02.popBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.Musician;

public class Percussion implements Musician {
    @Override
    public void play() {
        System.out.println("The percussion player plays drums and all percussion");
    }
}

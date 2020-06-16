package main.java.com.mkaloshyn.creational.abstract_factory_02.rockBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.Musician;

public class BassGuitarPlayer implements Musician {
    @Override
    public void play() {
        System.out.println("The bass-guitar player plays rock");
    }
}

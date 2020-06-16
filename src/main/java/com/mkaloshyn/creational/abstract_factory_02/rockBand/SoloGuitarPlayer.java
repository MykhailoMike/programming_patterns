package main.java.com.mkaloshyn.creational.abstract_factory_02.rockBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.Musician;

public class SoloGuitarPlayer implements Musician {
    @Override
    public void play() {
        System.out.println("The solo-guitar player plays rock");
    }
}

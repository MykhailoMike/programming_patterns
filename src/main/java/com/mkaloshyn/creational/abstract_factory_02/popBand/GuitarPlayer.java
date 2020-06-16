package main.java.com.mkaloshyn.creational.abstract_factory_02.popBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.Musician;

public class GuitarPlayer implements Musician {
    @Override
    public void play() {
        System.out.println("The guitar player of pop music band plays electro guitar");
    }
}

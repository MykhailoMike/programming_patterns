package main.java.com.mkaloshyn.creational.abstract_factory_02.rockBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.Soloist;

public class RockSinger implements Soloist {
    @Override
    public void sing() {
        System.out.println("The soloist of the rock band sings rock");
    }
}

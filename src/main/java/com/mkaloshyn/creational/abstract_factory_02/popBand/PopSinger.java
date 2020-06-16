package main.java.com.mkaloshyn.creational.abstract_factory_02.popBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.Soloist;

public class PopSinger implements Soloist {
    @Override
    public void sing() {
        System.out.println("The soloist of pop music band sings the solo part");
    }
}

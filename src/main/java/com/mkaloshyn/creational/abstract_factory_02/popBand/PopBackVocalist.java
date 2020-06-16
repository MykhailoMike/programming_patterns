package main.java.com.mkaloshyn.creational.abstract_factory_02.popBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.BackVocalist;

public class PopBackVocalist implements BackVocalist {
    @Override
    public void sing() {
        System.out.println("The back vocalist of pop music band sings some back up");
    }
}

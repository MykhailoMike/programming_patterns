package main.java.com.mkaloshyn.creational.abstract_factory_02.rockBand;

import main.java.com.mkaloshyn.creational.abstract_factory_02.BackVocalist;

public class RockBackVocalist implements BackVocalist {
    @Override
    public void sing() {
        System.out.println("The back vocalist of rock band sings some backup part");
    }
}

package main.java.com.mkaloshyn.behavioral.observer_19;

import java.util.Map;

public class Distributor  implements Observer{

    private String name;

    public Distributor(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Map<String, Integer> warehouse) {
        System.out.println("Distributor \"" + name + "\" has been informed on the latest stocks available: " +
                warehouse + "\n=======================================================");
    }
}

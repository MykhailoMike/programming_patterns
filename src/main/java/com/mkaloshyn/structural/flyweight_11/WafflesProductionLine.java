package main.java.com.mkaloshyn.structural.flyweight_11;

public class WafflesProductionLine implements ProductionLine {
    @Override
    public void produce() {
        System.out.println("Waffles production line is producing hazelnut waffles");
    }
}

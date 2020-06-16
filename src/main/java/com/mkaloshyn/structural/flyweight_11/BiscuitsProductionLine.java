package main.java.com.mkaloshyn.structural.flyweight_11;

public class BiscuitsProductionLine implements ProductionLine {
    @Override
    public void produce() {
        System.out.println("Biscuits production line is producing biscuits");
    }
}

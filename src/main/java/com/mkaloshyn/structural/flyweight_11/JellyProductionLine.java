package main.java.com.mkaloshyn.structural.flyweight_11;

public class JellyProductionLine implements ProductionLine {
    @Override
    public void produce() {
        System.out.println("Jelly production line is producing jelly candies");
    }
}

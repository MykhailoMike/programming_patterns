package main.java.com.mkaloshyn.structural.bridge_07;

public class BisquitsProductionLine implements ProductionLine {
    @Override
    public void produceGoods() {
        System.out.println("Production line is producing bisquits...");
    }
}

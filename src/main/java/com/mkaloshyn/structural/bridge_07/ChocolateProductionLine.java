package main.java.com.mkaloshyn.structural.bridge_07;

public class ChocolateProductionLine implements ProductionLine {
    @Override
    public void produceGoods() {
        System.out.println("Production line is producing tablet chocolate...");
    }
}

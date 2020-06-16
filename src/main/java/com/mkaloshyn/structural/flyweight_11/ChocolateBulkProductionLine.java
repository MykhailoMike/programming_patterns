package main.java.com.mkaloshyn.structural.flyweight_11;

public class ChocolateBulkProductionLine implements ProductionLine {
    @Override
    public void produce() {
        System.out.println("ChocolateBulk production line is producing chocolate bulk");
    }
}

package main.java.com.mkaloshyn.structural.bridge_07;

public abstract class Manufacture {

    protected ProductionLine productionLine;

    protected Manufacture(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    public abstract void produce();
}


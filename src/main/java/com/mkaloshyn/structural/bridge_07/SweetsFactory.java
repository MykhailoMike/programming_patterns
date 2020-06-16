package main.java.com.mkaloshyn.structural.bridge_07;

public class SweetsFactory extends Manufacture {

    public SweetsFactory(ProductionLine productionLine) {
        super(productionLine);
    }

    @Override
    public void produce() {
        System.out.println("The factory of sweets is currently operating...");
        productionLine.produceGoods();
    }
}

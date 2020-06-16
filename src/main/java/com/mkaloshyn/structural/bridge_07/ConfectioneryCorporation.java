package main.java.com.mkaloshyn.structural.bridge_07;

public class ConfectioneryCorporation extends Manufacture {

    public ConfectioneryCorporation(ProductionLine productionLine) {
        super(productionLine);
    }

    @Override
    public void produce() {
        System.out.println("Confectionery Corporation is currently operating...");
        productionLine.produceGoods();
    }
}

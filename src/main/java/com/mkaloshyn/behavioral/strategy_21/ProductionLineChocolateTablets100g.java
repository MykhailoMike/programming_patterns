package main.java.com.mkaloshyn.behavioral.strategy_21;

public class ProductionLineChocolateTablets100g {

    Sku sku;

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public void produceSku() {
        sku.produce();
    }
}

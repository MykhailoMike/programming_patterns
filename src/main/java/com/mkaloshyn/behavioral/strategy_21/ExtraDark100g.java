package main.java.com.mkaloshyn.behavioral.strategy_21;

public class ExtraDark100g implements Sku{
    @Override
    public void produce() {
        System.out.println("Producing extra dark chocolate 100g tablets ...");
    }
}

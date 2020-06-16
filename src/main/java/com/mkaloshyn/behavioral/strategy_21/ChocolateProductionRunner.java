package main.java.com.mkaloshyn.behavioral.strategy_21;

public class ChocolateProductionRunner {

    public static void main(String[] args) {

        ProductionLineChocolateTablets100g line = new ProductionLineChocolateTablets100g();

        line.setSku(new Dark100g());
        line.produceSku();

        System.out.println("==============================================");

        line.setSku(new Milk100g());
        line.produceSku();

        System.out.println("==============================================");

        line.setSku(new ExtraMilk100g());
        line.produceSku();

        System.out.println("==============================================");

        line.setSku(new ExtraDark100g());
        line.produceSku();
    }
}

package main.java.com.mkaloshyn.behavioral.observer_19;

public class Retail {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.refill("Coca-Cola", 1000);
        warehouse.refill("Fanta", 800);
        warehouse.refill("Sprite", 500);

        Observer distributor1 = new Distributor("AND Kharkiv");
        Observer distributor2 = new Distributor("SKS Kyiv");
        Observer distributor3 = new Distributor("SKS Cherkasy");

        warehouse.addObserver(distributor1);
        warehouse.addObserver(distributor2);
        warehouse.addObserver(distributor3);

        warehouse.refill("Coca-Cola", 300);
        System.out.println();
        warehouse.sellout("Fanta", 100);
    }
}

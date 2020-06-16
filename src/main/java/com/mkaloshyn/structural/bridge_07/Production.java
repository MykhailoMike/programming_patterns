package main.java.com.mkaloshyn.structural.bridge_07;

public class Production {

    public static void main(String[] args) {

        Manufacture[] manufactures = new Manufacture[]{
                new ConfectioneryCorporation(new ChocolateProductionLine()),
                new SweetsFactory(new BisquitsProductionLine())
        };

        for (Manufacture manufacture : manufactures) {
            manufacture.produce();
        }
    }
}

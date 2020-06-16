package main.java.com.mkaloshyn.behavioral.template_method_22;

public class WineProductionRunner {

    public static void main(String[] args) {

        ProductionOfWineBottleTemplate redWineProduction = new RedWineProduction();
        ProductionOfWineBottleTemplate whiteWineProduction = new WhiteWineProduction();

        redWineProduction.produce();

        System.out.println("============================");

        whiteWineProduction.produce();
    }
}

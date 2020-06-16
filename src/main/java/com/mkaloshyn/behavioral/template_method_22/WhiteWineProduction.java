package main.java.com.mkaloshyn.behavioral.template_method_22;

public class WhiteWineProduction extends ProductionOfWineBottleTemplate {
    @Override
    public void pourWineIntoTheBottle() {
        System.out.println("Pouring white wine into the bottle ...");
    }
}

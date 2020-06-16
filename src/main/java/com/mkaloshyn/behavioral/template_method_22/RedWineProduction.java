package main.java.com.mkaloshyn.behavioral.template_method_22;

public class RedWineProduction extends ProductionOfWineBottleTemplate{
    @Override
    public void pourWineIntoTheBottle() {
        System.out.println("Pouring red wine into the bottle ...");
    }
}

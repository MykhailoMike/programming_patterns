package main.java.com.mkaloshyn.behavioral.template_method_22;

public abstract class ProductionOfWineBottleTemplate {

    public void produce() {
        System.out.println("Preparing bottle ...");
        pourWineIntoTheBottle();
        System.out.println("Closing up bottle with cork ...");
        System.out.println("Sticking the label on the bottle of wine ...");
    }

    public abstract void pourWineIntoTheBottle();
}

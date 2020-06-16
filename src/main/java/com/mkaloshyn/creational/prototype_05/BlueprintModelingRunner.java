package main.java.com.mkaloshyn.creational.prototype_05;

import java.util.Arrays;

public class BlueprintModelingRunner {

    public static void main(String[] args) {
        Blueprint blueprint = new Blueprint("KraftFoods", 2435, Arrays.asList("Production",
                "Logistics", "Sales", "Marketing", "Finance"));

        System.out.println(blueprint);

        System.out.println();

        BlueprintFactory blueprintFactory = new BlueprintFactory(blueprint);

        Blueprint blueprint1Clone = blueprintFactory.cloneBlueprint();
        System.out.println(blueprint1Clone);
    }
}

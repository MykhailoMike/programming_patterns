package main.java.com.mkaloshyn.creational.prototype_05;

public class BlueprintFactory {

    private Blueprint blueprint;

    public BlueprintFactory(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    public void setBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    Blueprint cloneBlueprint() {
        return (Blueprint) blueprint.copy();
    }
}

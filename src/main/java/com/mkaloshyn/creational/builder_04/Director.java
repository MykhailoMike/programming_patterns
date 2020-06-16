package main.java.com.mkaloshyn.creational.builder_04;

public class Director {

    VolkswagenBuilder builder;

    public void setBuilder(VolkswagenBuilder builder) {
        this.builder = builder;
    }

    Volkswagen buildVolkswagen() {
        builder.createVolkswagen();
        builder.buildModel();
        builder.buildFuelType();
        builder.buildEngineValue();
        builder.buildTransmission();
        builder.buildColor();
        builder.buildPrice();

        return builder.getVolkswagen();
    }
}

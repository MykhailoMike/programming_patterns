package main.java.com.mkaloshyn.creational.builder_04;

public class VWJettaBuilder extends VolkswagenBuilder {
    @Override
    void buildModel() {
        vw.setModel("Jetta");
    }

    @Override
    void buildFuelType() {
        vw.setFuelType(FuelType.BIOETHANOL);
    }

    @Override
    void buildEngineValue() {
        vw.setEngineValue(1.6);
    }

    @Override
    void buildTransmission() {
        vw.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildColor() {
        vw.setColor("Grey");
    }

    @Override
    void buildPrice() {
        vw.setPrice(22_200);
    }
}

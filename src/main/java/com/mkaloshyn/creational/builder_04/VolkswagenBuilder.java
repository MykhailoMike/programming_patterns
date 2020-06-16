package main.java.com.mkaloshyn.creational.builder_04;

public abstract class VolkswagenBuilder {

    Volkswagen vw;

    void createVolkswagen() {
        vw = new Volkswagen();
    }

    abstract void buildModel();
    abstract void buildFuelType();
    abstract void buildEngineValue();
    abstract void buildTransmission();
    abstract void buildColor();
    abstract void buildPrice();

    Volkswagen getVolkswagen() {
        return vw;
    }
}




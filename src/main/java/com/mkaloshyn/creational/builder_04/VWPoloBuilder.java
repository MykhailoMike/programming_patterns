package main.java.com.mkaloshyn.creational.builder_04;

public class VWPoloBuilder extends VolkswagenBuilder {


    @Override
    void buildModel() {
        vw.setModel("Polo");
    }

    @Override
    void buildFuelType() {
        vw.setFuelType(FuelType.GASOLINE);
    }

    @Override
    void buildEngineValue() {
        vw.setEngineValue(1.4);
    }

    @Override
    void buildTransmission() {
        vw.setTransmission(Transmission.AUTOMATIC);
    }

    @Override
    void buildColor() {
        vw.setColor("Red");
    }

    @Override
    void buildPrice() {
        vw.setPrice(17_500);
    }
}

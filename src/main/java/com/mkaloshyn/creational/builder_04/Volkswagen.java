package main.java.com.mkaloshyn.creational.builder_04;

public class Volkswagen {

    private String model;
    private FuelType fuelType;
    private double engineValue;
    private Transmission transmission;
    private String color;
    private int price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineValue(double engineValue) {
        this.engineValue = engineValue;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Volkswagen{" +
                "model='" + model + '\'' +
                ", fuelType=" + fuelType +
                ", engineValue=" + engineValue +
                ", transmission=" + transmission +
                ", color='" + color + '\'' +
                '}';
    }
}

package main.java.com.mkaloshyn.creational.factory_01;

public class Program {

    public static void main(String[] args) {

        AutoFactory autoFactory = createAutoByFuelType("gasoline");
        Auto auto = autoFactory.createAuto();
        auto.fuelAuto();

    }

    static AutoFactory createAutoByFuelType(String fuelType) {

        if (fuelType.equalsIgnoreCase("gasoline")) {
            return new GasolineAutoFactory();
        } else if (fuelType.equalsIgnoreCase("diesel")) {
            return new DieselAutoFactory();
        } else if (fuelType.equalsIgnoreCase("gas")) {
            return new GasAutoFactory();
        } else {
            throw new RuntimeException("There is no factory for such a fuel type: " + fuelType);
        }
    }
}

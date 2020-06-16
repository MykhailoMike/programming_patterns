package main.java.com.mkaloshyn.creational.factory_01;

public class GasAutoFactory implements AutoFactory {
    @Override
    public Auto createAuto() {
        return new GasAuto();
    }
}

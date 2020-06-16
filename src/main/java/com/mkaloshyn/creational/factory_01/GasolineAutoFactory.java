package main.java.com.mkaloshyn.creational.factory_01;

public class GasolineAutoFactory implements AutoFactory {
    @Override
    public Auto createAuto() {
        return new GasolineAuto();
    }
}

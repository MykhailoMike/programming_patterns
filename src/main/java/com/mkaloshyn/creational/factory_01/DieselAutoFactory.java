package main.java.com.mkaloshyn.creational.factory_01;

public class DieselAutoFactory implements AutoFactory {
    @Override
    public Auto createAuto() {
        return new DieselAuto();
    }
}

package main.java.com.mkaloshyn.creational.builder_04;

public class BuildVWJettaRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VWJettaBuilder());
        Volkswagen vw = director.buildVolkswagen();
        System.out.println(vw);
    }
}

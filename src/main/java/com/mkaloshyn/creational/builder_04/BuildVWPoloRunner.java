package main.java.com.mkaloshyn.creational.builder_04;

public class BuildVWPoloRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VWPoloBuilder());
        Volkswagen vw = director.buildVolkswagen();
        System.out.println(vw);
    }
}

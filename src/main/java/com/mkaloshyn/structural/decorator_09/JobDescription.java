package main.java.com.mkaloshyn.structural.decorator_09;

public class JobDescription {

    public static void main(String[] args) {
        Marketer marketer = new MarketingDirector(new SeniorBrandManager(new BrandManager()));
        marketer.doJob();
    }
}

package main.java.com.mkaloshyn.structural.decorator_09;

public class MarketingDirector extends MarketerDecorator {

    public MarketingDirector(Marketer marketer) {
        super(marketer);
    }

    private void managePeople() {
        System.out.println("Manages direct reports.");
    }

    @Override
    public void doJob() {
        super.doJob();
        managePeople();
    }
}

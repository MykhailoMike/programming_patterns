package main.java.com.mkaloshyn.structural.decorator_09;

public class MarketerDecorator implements Marketer {

    private Marketer marketer;

    public MarketerDecorator(Marketer marketer) {
        this.marketer = marketer;
    }

    @Override
    public void doJob() {
        marketer.doJob();

    }
}

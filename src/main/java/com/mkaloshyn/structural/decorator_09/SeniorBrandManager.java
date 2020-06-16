package main.java.com.mkaloshyn.structural.decorator_09;

public class SeniorBrandManager extends MarketerDecorator {

    public SeniorBrandManager(Marketer marketer) {
        super(marketer);
    }

    private void planBudget() {
        System.out.println("Plans annual group of brands budget.");
    }

    @Override
    public void doJob() {
        super.doJob();
        planBudget();
    }
}

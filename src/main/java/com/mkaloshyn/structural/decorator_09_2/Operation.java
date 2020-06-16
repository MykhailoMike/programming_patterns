package main.java.com.mkaloshyn.structural.decorator_09_2;

public class Operation {
    public static void main(String[] args) {
        Calculator calculator = new AdvancedCalculator(new AverageCalculator(new SimpleCalculator()));
        System.out.println(calculator.calculate(2, 4, "pow"));
    }
}

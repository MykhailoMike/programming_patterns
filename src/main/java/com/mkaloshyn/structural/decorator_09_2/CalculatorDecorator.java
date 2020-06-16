package main.java.com.mkaloshyn.structural.decorator_09_2;

public class CalculatorDecorator implements Calculator {

    Calculator calculator;

    public CalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculate(int a, int b, String action) {
        return calculator.calculate(a, b, action);
    }
}

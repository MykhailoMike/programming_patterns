package main.java.com.mkaloshyn.structural.decorator_09_2;

public class AverageCalculator extends CalculatorDecorator {

    public AverageCalculator(Calculator calculator) {
        super(calculator);
    }

    double doAdditionalOperations(int a, int b, String action) {
        if (action.equalsIgnoreCase("multiply")) {
            return actionMultiply(a, b);
        } else if (action.equalsIgnoreCase("divide")) {
            return actionDivide(a, b);
        } else {
            throw new RuntimeException("There is no such action supported by calculator");
        }
    }

    double actionMultiply(int a, int b) {
        return a * b;
    }

    double actionDivide(int a, int b) {
        return (double)a / b;
    }

    @Override
    public double calculate(int a, int b, String action) {
        try {
            return super.calculate(a, b, action);
        } catch (RuntimeException e) {
            return doAdditionalOperations(a, b, action);
        }
    }
}

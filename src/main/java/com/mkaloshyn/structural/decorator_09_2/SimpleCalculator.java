package main.java.com.mkaloshyn.structural.decorator_09_2;

public class SimpleCalculator implements Calculator{

    @Override
    public double calculate(int a, int b, String action) {
        if (action.equalsIgnoreCase("plus")) {
            return actionSum(a, b);
        } else if (action.equalsIgnoreCase("minus")) {
            return actionSubstract(a, b);
        } else {
            throw new RuntimeException("There is no such action supported by calculator");
        }
    }

    double actionSum(int a, int b) {
        return a + b;
    }

    double actionSubstract(int a, int b) {
        return a - b;
    }
}

package main.java.com.mkaloshyn.structural.flyweight_11;

import java.util.ArrayList;
import java.util.List;

public class ManufactureRunner {

    public static void main(String[] args) {

        ProductionLineFactory productionLineFactory = new ProductionLineFactory();

        List<ProductionLine> lines = new ArrayList<>();

        lines.add(productionLineFactory.getLine("jelly"));
        lines.add(productionLineFactory.getLine("jelly"));
        lines.add(productionLineFactory.getLine("jelly"));
        lines.add(productionLineFactory.getLine("jelly"));
        lines.add(productionLineFactory.getLine("chocolate_bulk"));
        lines.add(productionLineFactory.getLine("chocolate_bulk"));
        lines.add(productionLineFactory.getLine("waffles"));
        lines.add(productionLineFactory.getLine("waffles"));
        lines.add(productionLineFactory.getLine("waffles"));

        for (ProductionLine line : lines) {
            System.out.println(line.hashCode());
            line.produce();
        }
    }
}

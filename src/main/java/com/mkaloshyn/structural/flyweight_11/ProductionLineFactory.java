package main.java.com.mkaloshyn.structural.flyweight_11;

import java.util.HashMap;
import java.util.Map;

public class ProductionLineFactory {

    Map<String, ProductionLine> lines = new HashMap<>();

    ProductionLine getLine(String productType) {

        ProductionLine line = lines.get(productType);

        if (line == null) {
            switch (productType) {
                case "biscuits":
                    System.out.println("Installing biscuits production line");
                    line = new BiscuitsProductionLine();
                    break;
                case "chocolate_bulk":
                    System.out.println("Installing chocolate_bulk production line");
                    line = new ChocolateBulkProductionLine();
                    break;
                case "jelly":
                    System.out.println("Installing jelly production line");
                    line = new JellyProductionLine();
                    break;
                case "waffles":
                    System.out.println("Installing waffles production line");
                    line = new WafflesProductionLine();
                    break;
            }
            lines.put(productType, line);
        }
        return line;
    }

}

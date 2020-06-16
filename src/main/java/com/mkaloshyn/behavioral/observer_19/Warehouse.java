package main.java.com.mkaloshyn.behavioral.observer_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse implements Observed {

    List<Observer> distributors = new ArrayList<>();
    Map<String, Integer> stocks = new HashMap<>();

    public void refill(String sku, Integer quantity) {
        if (stocks.get(sku) != null) {
            Integer increasedStock = stocks.get(sku) + quantity;
            stocks.put(sku, increasedStock);
        } else {
            stocks.put(sku, quantity);
        }
        notifyObservers();
    }

    public void sellout(String sku, Integer quantity) {
        if (stocks.get(sku) != null) {
            if (stocks.get(sku) >= quantity) {
                Integer decreasedStock = stocks.get(sku) - quantity;
                stocks.put(sku, decreasedStock);
            } else {
                stocks.put(sku, 0);
            }
            notifyObservers();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        distributors.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        distributors.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : distributors) {
            o.handleEvent(stocks);
        }
    }
}

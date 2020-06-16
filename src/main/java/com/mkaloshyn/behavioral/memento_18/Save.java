package main.java.com.mkaloshyn.behavioral.memento_18;

import java.time.LocalDateTime;

public class Save {

    private final double exchangeRate;
    private final LocalDateTime date;

    public Save(double exchangeRate, LocalDateTime date) {
        this.exchangeRate = exchangeRate;
        this.date = date;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public LocalDateTime getDate() {
        return date;
    }
}

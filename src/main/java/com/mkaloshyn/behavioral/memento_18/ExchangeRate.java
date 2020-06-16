package main.java.com.mkaloshyn.behavioral.memento_18;

import java.time.LocalDateTime;

public class ExchangeRate {

    private double exchangeRate;
    private LocalDateTime date;

    public void setExchangeRateAndDate(double rate) {
        exchangeRate = rate;
        date = LocalDateTime.now();
    }

    public Save save() {
        return new Save(exchangeRate, date);
    }

    public void load(Save save) {
        exchangeRate = save.getExchangeRate();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "ExchangeRate: " +
                +exchangeRate +
                ", date=" + date;
    }
}

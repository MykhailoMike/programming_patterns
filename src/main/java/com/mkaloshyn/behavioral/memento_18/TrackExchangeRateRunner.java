package main.java.com.mkaloshyn.behavioral.memento_18;

public class TrackExchangeRateRunner {

    public static void main(String[] args) throws InterruptedException {
        ExchangeRate rate = new ExchangeRate();
        RateRecorder rateRecorder = new RateRecorder();

        System.out.println("Start tracking:");
        rate.setExchangeRateAndDate(24.2);
        System.out.println(rate);
        System.out.println("Making the first record...");
        rateRecorder.setSave(rate.save());
        Thread.sleep(16000);
        System.out.println("Updating exchange rate");
        rate.setExchangeRateAndDate(24.8);
        System.out.println(rate);
        System.out.println("Crucial need to roll back");
        rate.load(rateRecorder.getSave());
        System.out.println("Exchange rate after roll back");
        System.out.println(rate);
    }


}

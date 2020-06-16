package main.java.com.mkaloshyn.behavioral.observer_19;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

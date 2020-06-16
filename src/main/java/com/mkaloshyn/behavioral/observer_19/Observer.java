package main.java.com.mkaloshyn.behavioral.observer_19;

import java.util.Map;

public interface Observer {
    void handleEvent(Map<String, Integer> warehouse);
}

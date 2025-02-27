package observer;

import java.util.ArrayList;
import java.util.List;

public class FlightEvent {
    private List<FlightObserver> observers = new ArrayList<>();
    private String flightNumber;
    private String status;

    public FlightEvent(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void addObserver(FlightObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(FlightObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (FlightObserver observer : observers) {
            observer.update(flightNumber, status);
        }
    }
}

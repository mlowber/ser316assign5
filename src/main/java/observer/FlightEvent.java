package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a flight event that can be observed by multiple control towers.
 *
 * Functional Requirements Addressed:
 * - The simulation includes an event system where flight status changes trigger notifications.
 * - Control towers (observers) automatically receive flight updates.
 */

public class FlightEvent {
    private List<FlightObserver> observers = new ArrayList<>();
    private String flightNumber;
    private String status;

    /**
     * Constructor to initialize a flight event.
     * @param flightNumber The unique identifier for the flight.
     */
    public FlightEvent(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * Registers an observer to receive flight status updates.
     * @param observer The observer to be added.
     */
    public void addObserver(FlightObserver observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from receiving flight status updates.
     * @param observer The observer to be removed.
     */
    public void removeObserver(FlightObserver observer) {
        observers.remove(observer);
    }

    /**
     * Updates the flight status and notifies all registered observers.
     * @param status The new flight status.
     */
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    /**
     * Notifies all registered observers about the flight status change.
     */
    private void notifyObservers() {
        for (FlightObserver observer : observers) {
            observer.update(flightNumber, status);
        }
    }
}

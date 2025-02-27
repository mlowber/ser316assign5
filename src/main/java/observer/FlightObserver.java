package observer;

/**
 * Observer interface for receiving flight status updates.
 * Implementing classes must define the update method.
 */
public interface FlightObserver {

    /**
     * Called when a flight status changes.
     * @param flightNumber The flight number that changed status.
     * @param status The new status of the flight (e.g., "Arrived", "Departed").
     */
    void update(String flightNumber, String status);
}

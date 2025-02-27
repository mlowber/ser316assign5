package observer;

/**
 * Represents a control tower that observes flight status changes.
 */
public class ControlTower implements FlightObserver {
    private String towerName;

    /**
     * Constructor to initialize a control tower with a specific name.
     * @param name The name of the control tower.
     */
    public ControlTower(String name) {
        this.towerName = name;
    }

    /**
     * Receives an update when a flight's status changes.
     * @param flightNumber The flight number that changed status.
     * @param status The new status of the flight.
     */
    @Override
    public void update(String flightNumber, String status) {
        System.out.println("Control Tower [" + towerName + "] received update: Flight " + flightNumber + " is now " + status);
    }
}

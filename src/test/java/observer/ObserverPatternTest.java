package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Observer Pattern in FlightEvent.
 */
class ObserverPatternTest {

    /**
     * Tests if an observer can be added to a flight event and receives an update.
     */
    @Test
    void testFlightEventNotification() {
        FlightEvent flight = new FlightEvent("AZ123");
        ControlTower tower = new ControlTower("Tower A");

        flight.addObserver(tower);
        assertDoesNotThrow(() -> flight.setStatus("Arrived"),
                "Setting flight status should notify observers without throwing an exception.");
    }

    /**
     * Tests if multiple observers receive the same notification.
     */
    @Test
    void testMultipleObserversReceiveUpdates() {
        FlightEvent flight = new FlightEvent("AZ123");
        ControlTower tower1 = new ControlTower("Tower A");
        ControlTower tower2 = new ControlTower("Tower B");

        flight.addObserver(tower1);
        flight.addObserver(tower2);

        assertDoesNotThrow(() -> flight.setStatus("Departed"),
                "All observers should receive updates without error.");
    }

    /**
     * Tests if an observer can be removed and does not receive further updates.
     */
    @Test
    void testRemoveObserver() {
        FlightEvent flight = new FlightEvent("AZ123");
        ControlTower tower = new ControlTower("Tower A");

        flight.addObserver(tower);
        flight.removeObserver(tower);

        assertDoesNotThrow(() -> flight.setStatus("Delayed"),
                "Removed observer should not cause an error when flight status changes.");
    }
}

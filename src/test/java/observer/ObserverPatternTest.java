package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObserverPatternTest {
    @Test
    void testFlightEventNotification() {
        FlightEvent flight = new FlightEvent("AZ123");
        ControlTower tower = new ControlTower("Tower A");

        flight.addObserver(tower);
        assertDoesNotThrow(() -> flight.setStatus("Arrived"));
    }
}

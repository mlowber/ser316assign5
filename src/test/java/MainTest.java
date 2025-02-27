package test;

import factory.Airplane;
import factory.AirplaneFactory;
import observer.FlightEvent;
import observer.ControlTower;
import airport.Airport;
import strategy.BasicAllocation;
import strategy.PeakHourAllocation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the main Airport Simulation functionality.
 */
public class MainTest {

    private FlightEvent flightEvent;
    private ControlTower tower;
    private Airport airport;

    @BeforeEach
    void setUp() {
        // Initialize common objects before each test
        flightEvent = new FlightEvent("AZ123");
        tower = new ControlTower("Tower A");
        airport = new Airport(new BasicAllocation());
    }

    // ===========================
    // Factory Pattern Tests
    // ===========================

    @Test
    void testAirplaneFactoryCreatesCommercialAirplane() {
        Airplane airplane = AirplaneFactory.createAirplane("commercial");
        assertNotNull(airplane, "Airplane should not be null.");
        assertEquals("Commercial Jet", airplane.getModel(), "Model should match expected value.");
    }

    @Test
    void testAirplaneFactoryCreatesCargoAirplane() {
        Airplane airplane = AirplaneFactory.createAirplane("cargo");
        assertNotNull(airplane, "Airplane should not be null.");
        assertEquals("Cargo Plane", airplane.getModel(), "Model should match expected value.");
    }

    // ===========================
    // Observer Pattern Tests
    // ===========================

    @Test
    void testFlightEventNotifiesObservers() {
        flightEvent.addObserver(tower);

        assertDoesNotThrow(() -> flightEvent.setStatus("Arrived"),
                "Updating flight status should not throw an exception.");
    }

    @Test
    void testFlightEventSupportsMultipleObservers() {
        ControlTower tower2 = new ControlTower("Tower B");
        flightEvent.addObserver(tower);
        flightEvent.addObserver(tower2);

        assertDoesNotThrow(() -> flightEvent.setStatus("Departed"),
                "Updating flight status should notify multiple observers without error.");
    }

    // ===========================
    // Strategy Pattern Tests
    // ===========================

    @Test
    void testBasicAllocationStrategy() {
        assertDoesNotThrow(() -> airport.allocateGate("AZ123", "commercial"),
                "Gate allocation should work with BasicAllocation strategy.");
    }

    @Test
    void testPeakHourAllocationStrategy() {
        airport.setAllocationStrategy(new PeakHourAllocation());
        assertDoesNotThrow(() -> airport.allocateGate("BZ456", "cargo"),
                "Gate allocation should work with PeakHourAllocation strategy.");
    }
}

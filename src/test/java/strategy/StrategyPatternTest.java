package strategy;

import org.junit.jupiter.api.Test;
import airport.Airport;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Strategy Pattern in airport gate allocation.
 */
class StrategyPatternTest {

    /**
     * Tests if the Basic Allocation strategy correctly assigns a gate.
     */
    @Test
    void testBasicAllocation() {
        Airport airport = new Airport(new BasicAllocation());
        assertDoesNotThrow(() -> airport.allocateGate("AZ123", "commercial"),
                "Basic Allocation strategy should function without errors.");
    }

    /**
     * Tests if the Peak Hour Allocation strategy correctly assigns a gate.
     */
    @Test
    void testPeakHourAllocation() {
        Airport airport = new Airport(new PeakHourAllocation());
        assertDoesNotThrow(() -> airport.allocateGate("BZ456", "cargo"),
                "Peak Hour Allocation strategy should function without errors.");
    }

    /**
     * Tests if the airport can switch between different allocation strategies.
     */
    @Test
    void testChangeAllocationStrategy() {
        Airport airport = new Airport(new BasicAllocation());
        airport.setAllocationStrategy(new PeakHourAllocation());

        assertDoesNotThrow(() -> airport.allocateGate("CZ789", "commercial"),
                "Switching allocation strategies should work without errors.");
    }
}

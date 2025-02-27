package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyPatternTest {
    @Test
    void testBasicAllocation() {
        ResourceAllocationStrategy strategy = new BasicAllocation();
        assertDoesNotThrow(() -> strategy.allocateGate("AZ123", "commercial"));
    }

    @Test
    void testPeakHourAllocation() {
        ResourceAllocationStrategy strategy = new PeakHourAllocation();
        assertDoesNotThrow(() -> strategy.allocateGate("BZ456", "cargo"));
    }
}

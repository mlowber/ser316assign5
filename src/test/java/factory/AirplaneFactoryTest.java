package factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Factory Pattern in AirplaneFactory.
 */
class AirplaneFactoryTest {

    /**
     * Tests if the factory correctly creates a Commercial Airplane.
     */
    @Test
    void testCommercialAirplaneCreation() {
        Airplane airplane = AirplaneFactory.createAirplane("commercial");
        assertNotNull(airplane, "Airplane should not be null.");
        assertEquals("Commercial Jet", airplane.getModel(), "Model should match expected value.");
    }

    /**
     * Tests if the factory correctly creates a Cargo Airplane.
     */
    @Test
    void testCargoAirplaneCreation() {
        Airplane airplane = AirplaneFactory.createAirplane("cargo");
        assertNotNull(airplane, "Airplane should not be null.");
        assertEquals("Cargo Plane", airplane.getModel(), "Model should match expected value.");
    }

    /**
     * Tests if the factory throws an exception for an invalid airplane type.
     */
    @Test
    void testInvalidAirplaneType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AirplaneFactory.createAirplane("invalidType");
        });
        assertEquals("Unknown airplane type: invalidType", exception.getMessage());
    }
}

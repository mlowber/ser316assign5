package factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AirplaneFactoryTest {
    @Test
    void testCommercialAirplaneCreation() {
        Airplane airplane = AirplaneFactory.createAirplane("commercial");
        assertNotNull(airplane);
        assertEquals("Commercial Jet", airplane.getModel());
    }

    @Test
    void testCargoAirplaneCreation() {
        Airplane airplane = AirplaneFactory.createAirplane("cargo");
        assertNotNull(airplane);
        assertEquals("Cargo Plane", airplane.getModel());
    }
}

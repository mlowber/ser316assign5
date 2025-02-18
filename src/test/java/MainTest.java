import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

// Simple Factory Pattern Example
class AirplaneFactory {
    static String createAirplane() {
        return "Boeing 747"; // Simulating an airplane being created
    }
}

class MainTest {
    @Test
    void testFactoryPattern() {
        String airplane = AirplaneFactory.createAirplane();
        assertNotNull(airplane, "Airplane should not be null");
    }
}

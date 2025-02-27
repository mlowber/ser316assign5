package factory;

/**
 * Factory class for creating different types of airplanes dynamically.
 *
 * Functional Requirements Addressed:
 * - The airport simulation includes different types of aircraft.
 * - Airplanes are instantiated dynamically based on their type.
 */

public class AirplaneFactory {

    /**
     * Creates an airplane of the specified type.
     * @param type The type of airplane to create (e.g., "commercial" or "cargo").
     * @return An instance of the requested airplane type.
     * @throws IllegalArgumentException If an unknown type is provided.
     */
    public static Airplane createAirplane(String type) {
        if (type.equalsIgnoreCase("commercial")) {
            return new CommercialAirplane();
        } else if (type.equalsIgnoreCase("cargo")) {
            return new CargoAirplane();
        } else {
            throw new IllegalArgumentException("Unknown airplane type: " + type);
        }
    }
}

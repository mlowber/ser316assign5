package strategy;

/**
 * Strategy interface for resource allocation at the airport.
 * Implementing classes define how gates are assigned to flights.
 */
public interface ResourceAllocationStrategy {

    /**
     * Allocates a gate to a flight based on the implemented strategy.
     * @param flightNumber The flight number that needs a gate.
     * @param flightType The type of flight (e.g., "commercial" or "cargo").
     */
    void allocateGate(String flightNumber, String flightType);
}

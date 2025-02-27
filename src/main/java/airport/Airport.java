package airport;

import strategy.ResourceAllocationStrategy;

/**
 * The Airport class manages gate allocation for arriving flights.
 *
 * Functional Requirements Addressed:
 * - The simulation includes resource allocation (gates) for arriving flights.
 * - The airport dynamically adjusts gate allocation based on predefined strategies.
 */

public class Airport {
    private ResourceAllocationStrategy allocationStrategy;

    /**
     * Constructor to initialize the airport with a specific allocation strategy.
     * @param strategy The initial resource allocation strategy.
     */
    public Airport(ResourceAllocationStrategy strategy) {
        this.allocationStrategy = strategy;
    }

    /**
     * Updates the airport's allocation strategy dynamically.
     * @param strategy The new resource allocation strategy to be used.
     */
    public void setAllocationStrategy(ResourceAllocationStrategy strategy) {
        this.allocationStrategy = strategy;
    }

    /**
     * Allocates a gate to a flight based on the current allocation strategy.
     * @param flightNumber The flight's identification number.
     * @param flightType The type of flight (e.g., "commercial" or "cargo").
     */
    public void allocateGate(String flightNumber, String flightType) {
        allocationStrategy.allocateGate(flightNumber, flightType);
    }
}

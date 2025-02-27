package strategy;

/**
 * Implements a basic first-come, first-served allocation strategy.
 */
public class BasicAllocation implements ResourceAllocationStrategy {

    /**
     * Allocates a gate to the given flight without prioritization.
     * @param flightNumber The flight number.
     * @param flightType The type of flight.
     */
    @Override
    public void allocateGate(String flightNumber, String flightType) {
        System.out.println("Basic Allocation: Gate assigned to Flight " + flightNumber + " (" + flightType + ")");
    }
}

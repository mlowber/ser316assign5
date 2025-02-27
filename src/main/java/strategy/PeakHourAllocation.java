package strategy;

/**
 * Implements an allocation strategy that prioritizes commercial flights during peak hours.
 */
public class PeakHourAllocation implements ResourceAllocationStrategy {

    /**
     * Allocates a gate, prioritizing commercial flights over cargo flights.
     * @param flightNumber The flight number.
     * @param flightType The type of flight.
     */
    @Override
    public void allocateGate(String flightNumber, String flightType) {
        if (flightType.equalsIgnoreCase("commercial")) {
            System.out.println("Peak Hour Allocation: PRIORITY given to Flight " + flightNumber + " (" + flightType + ")");
        } else {
            System.out.println("Peak Hour Allocation: Cargo Flight " + flightNumber + " may have to wait.");
        }
    }
}

package strategy;

public class PeakHourAllocation implements ResourceAllocationStrategy {
    @Override
    public void allocateGate(String flightNumber, String flightType) {
        if (flightType.equalsIgnoreCase("commercial")) {
            System.out.println("Peak Hour Allocation: PRIORITY given to Flight " + flightNumber + " (" + flightType + ")");
        } else {
            System.out.println("Peak Hour Allocation: Cargo Flight " + flightNumber + " may have to wait.");
        }
    }
}

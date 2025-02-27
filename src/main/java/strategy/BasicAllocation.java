package strategy;

public class BasicAllocation implements ResourceAllocationStrategy {
    @Override
    public void allocateGate(String flightNumber, String flightType) {
        System.out.println("Basic Allocation: Gate assigned to Flight " + flightNumber + " (" + flightType + ")");
    }
}

import airport.Airport;
import strategy.BasicAllocation;
import strategy.PeakHourAllocation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Airport Simulation: Strategy Pattern Test");

        // Initialize airport with Basic Allocation strategy
        Airport airport = new Airport(new BasicAllocation());

        // Allocate gates using Basic Allocation
        airport.allocateGate("AZ123", "commercial");
        airport.allocateGate("BZ456", "cargo");

        // Switch to Peak Hour Allocation strategy
        System.out.println("\nSwitching to Peak Hour Strategy...");
        airport.setAllocationStrategy(new PeakHourAllocation());

        // Allocate gates using Peak Hour Allocation
        airport.allocateGate("AZ123", "commercial");
        airport.allocateGate("BZ456", "cargo");
    }
}

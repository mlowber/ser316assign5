import factory.Airplane;
import factory.AirplaneFactory;
import observer.FlightEvent;
import observer.ControlTower;
import airport.Airport;
import strategy.BasicAllocation;
import strategy.PeakHourAllocation;

/**
 * Main class for the Airport Simulation.
 * Demonstrates the Factory, Observer, and Strategy Patterns.
 */
public class Main {

    /**
     * Entry point of the simulation.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("Airport Simulation Started\n");

        // ===========================
        // Factory Pattern Demonstration
        // ===========================
        System.out.println("Factory Pattern: Creating Airplanes");

        // Creating different types of airplanes using the factory
        Airplane commercialPlane = AirplaneFactory.createAirplane("commercial");
        Airplane cargoPlane = AirplaneFactory.createAirplane("cargo");

        // Display airplane details
        commercialPlane.displayInfo();
        cargoPlane.displayInfo();

        System.out.println("\n");

        // ===========================
        // Observer Pattern Demonstration
        // ===========================
        System.out.println("Observer Pattern: Flight Status Notifications");

        // Create a flight event
        FlightEvent flight1 = new FlightEvent("AZ123");

        // Create control towers as observers
        ControlTower tower1 = new ControlTower("Tower A");
        ControlTower tower2 = new ControlTower("Tower B");

        // Add observers to the flight event
        flight1.addObserver(tower1);
        flight1.addObserver(tower2);

        // Change flight status to notify observers
        flight1.setStatus("Arrived");
        flight1.setStatus("Departed");

        System.out.println("\n");

        // ===========================
        // Strategy Pattern Demonstration
        // ===========================
        System.out.println("Strategy Pattern: Gate Allocation Strategies");

        // Initialize the airport with a Basic Allocation strategy
        Airport airport = new Airport(new BasicAllocation());

        // Allocate gates using the Basic Allocation strategy
        airport.allocateGate("AZ123", "commercial");
        airport.allocateGate("BZ456", "cargo");

        // Switch to Peak Hour Allocation strategy
        System.out.println("\nSwitching to Peak Hour Strategy...");
        airport.setAllocationStrategy(new PeakHourAllocation());

        // Allocate gates using the Peak Hour Allocation strategy
        airport.allocateGate("AZ123", "commercial");
        airport.allocateGate("BZ456", "cargo");

        System.out.println("\nAirport Simulation Completed.");
    }
}

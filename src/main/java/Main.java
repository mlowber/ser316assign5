import observer.FlightEvent;
import observer.ControlTower;

public class Main {
    public static void main(String[] args) {
        System.out.println("Airport Simulation: Observer Pattern Test");

        // Create flight event
        FlightEvent flight1 = new FlightEvent("AZ123");

        // Create observers
        ControlTower tower1 = new ControlTower("Tower A");
        ControlTower tower2 = new ControlTower("Tower B");

        // Add observers
        flight1.addObserver(tower1);
        flight1.addObserver(tower2);

        // Simulate flight status changes
        flight1.setStatus("Arrived");
        flight1.setStatus("Departed");
    }
}

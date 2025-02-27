package factory;

/**
 * Represents a cargo airplane, used for transporting goods.
 */
public class CargoAirplane extends Airplane {

    /**
     * Constructor to initialize a cargo airplane with predefined attributes.
     */
    public CargoAirplane() {
        super("Cargo Plane", 50, 3.2);
    }

    /**
     * Displays the details of the cargo airplane.
     */
    @Override
    public void displayInfo() {
        System.out.println("📦 Cargo Airplane: Model=" + model + ", Capacity=" + capacity + ", Fuel Efficiency=" + fuelEfficiency + " L/km");
    }
}

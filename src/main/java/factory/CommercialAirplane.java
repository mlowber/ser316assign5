package factory;

/**
 * Represents a commercial airplane, typically used for passenger flights.
 */
public class CommercialAirplane extends Airplane {

    /**
     * Constructor to initialize a commercial airplane with predefined attributes.
     */
    public CommercialAirplane() {
        super("Commercial Jet", 180, 5.5);
    }

    /**
     * Displays the details of the commercial airplane.
     */
    @Override
    public void displayInfo() {
        System.out.println("🚀 Commercial Airplane: Model=" + model + ", Capacity=" + capacity + ", Fuel Efficiency=" + fuelEfficiency + " L/km");
    }
}

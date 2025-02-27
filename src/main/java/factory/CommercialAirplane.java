package factory;

public class CommercialAirplane extends Airplane {
    public CommercialAirplane() {
        super("Commercial Jet", 180, 5.5);
    }

    @Override
    public void displayInfo() {
        System.out.println("Commercial Airplane: Model=" + model + ", Capacity=" + capacity + ", Fuel Efficiency=" + fuelEfficiency + " L/km");
    }
}

package factory;

public class CargoAirplane extends Airplane {
    public CargoAirplane() {
        super("Cargo Plane", 50, 3.2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Cargo Airplane: Model=" + model + ", Capacity=" + capacity + ", Fuel Efficiency=" + fuelEfficiency + " L/km");
    }
}

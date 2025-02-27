package factory;

/**
 * Abstract class representing a general airplane.
 * This serves as the base class for specific airplane types.
 */
public abstract class Airplane {
    protected String model;
    protected int capacity;
    protected double fuelEfficiency;

    /**
     * Constructor to initialize an airplane with its basic properties.
     * @param model The model name of the airplane.
     * @param capacity The passenger or cargo capacity of the airplane.
     * @param fuelEfficiency The fuel efficiency of the airplane in liters per kilometer.
     */
    public Airplane(String model, int capacity, double fuelEfficiency) {
        this.model = model;
        this.capacity = capacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    /**
     * Retrieves the model of the airplane.
     * @return The model name.
     */
    public String getModel() {
        return model;
    }

    /**
     * Retrieves the capacity of the airplane.
     * @return The passenger or cargo capacity.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Retrieves the fuel efficiency of the airplane.
     * @return Fuel efficiency in liters per kilometer.
     */
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    /**
     * Abstract method that must be implemented by subclasses to display airplane details.
     */
    public abstract void displayInfo();
}

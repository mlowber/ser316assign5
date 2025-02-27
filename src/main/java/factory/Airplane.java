package factory;

public abstract class Airplane {
    protected String model;
    protected int capacity;
    protected double fuelEfficiency;

    public Airplane(String model, int capacity, double fuelEfficiency) {
        this.model = model;
        this.capacity = capacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getModel() { return model; }
    public int getCapacity() { return capacity; }
    public double getFuelEfficiency() { return fuelEfficiency; }

    public abstract void displayInfo();
}

package observer;

public class ControlTower implements FlightObserver {
    private String towerName;

    public ControlTower(String name) {
        this.towerName = name;
    }

    @Override
    public void update(String flightNumber, String status) {
        System.out.println("Control Tower [" + towerName + "] received update: Flight " + flightNumber + " is now " + status);
    }
}

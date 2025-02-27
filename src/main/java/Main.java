import factory.Airplane;
import factory.AirplaneFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Airport Simulation: Airplane Factory Test");

        Airplane commercialPlane = AirplaneFactory.createAirplane("commercial");
        Airplane cargoPlane = AirplaneFactory.createAirplane("cargo");

        commercialPlane.displayInfo();
        cargoPlane.displayInfo();
    }
}

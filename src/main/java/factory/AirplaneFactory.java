package factory;

public class AirplaneFactory {
    public static Airplane createAirplane(String type) {
        if (type.equalsIgnoreCase("commercial")) {
            return new CommercialAirplane();
        } else if (type.equalsIgnoreCase("cargo")) {
            return new CargoAirplane();
        } else {
            throw new IllegalArgumentException("Unknown airplane type: " + type);
        }
    }
}

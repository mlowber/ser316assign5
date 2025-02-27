package strategy;

public interface ResourceAllocationStrategy {
    void allocateGate(String flightNumber, String flightType);
}

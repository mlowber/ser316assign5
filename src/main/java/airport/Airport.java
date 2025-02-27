package airport;

import strategy.ResourceAllocationStrategy;

public class Airport {
    private ResourceAllocationStrategy allocationStrategy;

    public Airport(ResourceAllocationStrategy strategy) {
        this.allocationStrategy = strategy;
    }

    public void setAllocationStrategy(ResourceAllocationStrategy strategy) {
        this.allocationStrategy = strategy;
    }

    public void allocateGate(String flightNumber, String flightType) {
        allocationStrategy.allocateGate(flightNumber, flightType);
    }
}

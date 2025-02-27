# Airport Simulation – Design Patterns Implementation

## **Screencast Link**
[Insert Screencast Link Here]

---

## **Implemented Design Patterns**
This project demonstrates three key design patterns:

### **Factory Pattern**
- Used to create different types of airplanes dynamically.
- Allows new airplane types to be added without modifying existing logic.
- Implemented in `AirplaneFactory.java`, `CommercialAirplane.java`, and `CargoAirplane.java`.

### **Observer Pattern**
- Used to notify control towers when flights arrive or depart.
- Ensures multiple observers (control towers) receive updates on flight status changes.
- Implemented in `FlightEvent.java` and `ControlTower.java`.

### **Strategy Pattern**
- Used to allocate gates dynamically using different allocation strategies.
- Allows switching between allocation methods without modifying airport logic.
- Implemented in `Airport.java`, `BasicAllocation.java`, and `PeakHourAllocation.java`.

---

## **Requirements Fulfilled**
The following table maps each design pattern to the functional requirements it fulfills.

### **Factory Pattern (Airplane Creation)**
| **Requirement** | **How It’s Addressed** |
|---------------|------------------------|
| The simulation includes different types of aircraft. | Implemented using `AirplaneFactory.java` to create different airplane types dynamically. |
| Airplanes are instantiated dynamically rather than hardcoded. | The factory method generates airplanes at runtime based on input. |
| Each aircraft type has its own unique characteristics. | `CommercialAirplane.java` and `CargoAirplane.java` define unique aircraft properties. |

### **Observer Pattern (Flight Notifications)**
| **Requirement** | **How It’s Addressed** |
|---------------|------------------------|
| The simulation includes an event system where flight status changes trigger notifications. | Implemented via `FlightEvent.java`, which notifies observers when a flight status is updated. |
| Control towers automatically receive flight updates. | Implemented via `ControlTower.java`, which listens for changes from `FlightEvent.java`. |
| The simulation should handle multiple observers receiving the same event update. | `FlightEvent.java` supports multiple `ControlTower` instances and notifies all observers when a flight status changes. |

### **Strategy Pattern (Gate Allocation)**
| **Requirement** | **How It’s Addressed** |
|---------------|------------------------|
| The airport has a system for allocating gates to flights. | Implemented in `Airport.java`, which assigns gates based on the selected strategy. |
| The airport must support different gate allocation strategies. | Implemented via `BasicAllocation.java` (first-come, first-served) and `PeakHourAllocation.java` (priority-based). |
| The airport should be able to switch between allocation strategies dynamically. | Implemented in `Airport.java`, which allows changing the allocation strategy at runtime. |

---

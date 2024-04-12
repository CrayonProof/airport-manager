package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages passenger operations in the airport management system.
 */
public class PassengerManager {
    private List<Passenger> passengers;

    public PassengerManager() {
        this.passengers = new ArrayList<>();
    }

    /**
     * Adds a new passenger to the system.
     * @param passenger The passenger to add.
     */
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        System.out.println("Passenger added: " + passenger);
    }

    /**
     * Finds and returns a list of passengers for a specific flight.
     * @param flightId The ID of the flight.
     * @return A list of passengers for the flight.
     */
    public List<Passenger> getPassengersByFlight(int flightId) {
        List<Passenger> result = new ArrayList<>();
        for (Passenger passenger : passengers) {
            if (passenger.getFlightId() == flightId) {
                result.add(passenger);
            }
        }
        return result;
    }

    // Additional methods for updating and deleting passengers can be implemented...
}


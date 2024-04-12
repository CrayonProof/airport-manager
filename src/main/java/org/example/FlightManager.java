package org.example;

import java.util.ArrayList;

/**
 * Manages flight operations in the airport management system.
 */
public class FlightManager {
    private ArrayList<Flight> flights;
    private FileManager fileManager;

    public FlightManager() {
        this.flights = new ArrayList<>();
        this.fileManager = new FileManager();
    }

    /**
     * Adds a new flight to the system.
     * @param flight The flight to add.
     */
    public void addFlight(Flight flight) {
        flights.add(flight);
        System.out.println("Flight added: " + flight);
    }

    /**
     * Adds a new flight to the system.
     * @param flight The flight to add.
     */
    public void addFlights(ArrayList<Flight> flights) {
        flights.addAll(flights);
        System.out.println("Added " + flights.size() + "flights");
    }

    /**
     * Adds a new flight to the system.
     */
    public ArrayList<Flight> getFlights() {
        return this.flights;
    }

    //TODO: Implement more CRUD operations
}

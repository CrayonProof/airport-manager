package org.example;

/**
 * Represents a passenger in the airport management system.
 */
public class Passenger {
    private static int passengerCount = 0;
    private int passengerId;
    private String name;
    private int flightId;

    /**
     * Constructor for creating a new Passenger object.
     * @param name Name of the passenger.
     * @param flightId ID of the flight the passenger is booked on.
     */
    public Passenger(String name, int flightId) {
        this.passengerId = ++passengerCount;
        this.name = name;
        this.flightId = flightId;
    }

    // Accessor methods
    public int getPassengerId() { return passengerId; }
    public String getName() { return name; }
    public int getFlightId() { return flightId; }

    // toString method for displaying passenger information
    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", name='" + name + '\'' +
                ", flightId=" + flightId +
                '}';
    }
}

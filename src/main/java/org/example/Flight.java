package org.example;

/**
 * Represents a flight in the airport management system.
 */
public class Flight {
    private static int flightCount = 0;
    private int flightId;
    private String destination;
    private int capacity;
    private String departureTime;

    /**
     * Constructor for creating a new Flight object.
     * @param destination Destination of the flight.
     * @param capacity Maximum passenger capacity.
     * @param departureTime Departure time of the flight.
     */
    public Flight(String destination, int capacity, String departureTime) {
        this.flightId = ++flightCount;
        this.destination = destination;
        this.capacity = capacity;
        this.departureTime = departureTime;
    }

    // Accessor methods
    public int getFlightId() { return flightId; }
    public String getDestination() { return destination; }
    public int getCapacity() { return capacity; }
    public String getDepartureTime() { return departureTime; }

    // toString method for displaying flight information
    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", destination='" + destination + '\'' +
                ", capacity=" + capacity +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}

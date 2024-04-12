package org.example;

import java.util.Scanner;

/**
 * The main class for the Airport Management System application.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightManager flightManager = new FlightManager();
        PassengerManager passengerManager = new PassengerManager();

        // Read data from permanent storage at startup
        flightManager.addFlights(FileManager.readFlightsFromFile());

        // Example of adding a flight
        System.out.println("Adding a sample flight.");
        Flight slc = new Flight("Edinburgh", 200, "2024-05-02 14:35");
        flightManager.addFlight(slc);

        // Save data to permanent storage
        FileManager.writeFlightsToFile(flightManager.getFlights());

        // Closing resources
        scanner.close();
    }
}

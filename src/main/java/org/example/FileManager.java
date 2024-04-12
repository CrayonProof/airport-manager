package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles CSV file operations for the airport management system.
 */
public class FileManager {

    private static final String FLIGHTS_FILE = "flights.csv";

    /**
     * Writes flight data to a CSV file.
     * @param flights The list of flights to write.
     */
    public static void writeFlightsToFile(List<Flight> flights) {
        try (PrintWriter pw = new PrintWriter(new File(FLIGHTS_FILE))) {
            for (Flight flight : flights) {
                pw.println(flight.getFlightId() + "," + flight.getDestination() + ","
                        + flight.getCapacity() + "," + flight.getDepartureTime());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads flight data from a CSV file and returns a list of flights.
     * @return A list of flights read from the file.
     */
    public static ArrayList<Flight> readFlightsFromFile() {
        ArrayList<Flight> flights = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FLIGHTS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] flightData = line.split(",");
                Flight flight = new Flight(flightData[1], Integer.parseInt(flightData[2]), flightData[3]);
                flights.add(flight);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return flights;
    }
}

/*
============== Java Programming II ==============
Part 11
Section 2 - Packages
Ex 10 - Flight Control


Implement the packages and their contents as directed by the instructions.
=================================================
*/


package FlightControl;

import FlightControl.domain.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class FlightControl {
    
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashSet<String> places;
    
    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashSet<>();
    }
    
    public void addAirplane(String airplaneID, int capacity) {
        this.airplanes.put(airplaneID, new Airplane(airplaneID, capacity));
    }
    
    public void addFlight(Airplane airplane, String departureAirportID, String targetAirportID) {
        
        this.places.add(departureAirportID);
        this.places.add(targetAirportID);
        Flight flight = new Flight(airplane, departureAirportID, targetAirportID);
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplane(String airplaneID) {
        return this.airplanes.get(airplaneID);
    }
}

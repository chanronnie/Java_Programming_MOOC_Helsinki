/*
============== Java Programming II ==============
Part 11
Section 2 - Packages
Ex 10 - Flight Control


Implement the packages and their contents as directed by the instructions.
=================================================
*/


package FlightControl.domain;

public class Flight {
    private Airplane airport;
    private String departureAirport;
    private String targetAirport;
    
    public Flight(Airplane airport, String departureAirport, String targetAirport) {
        this.airport = airport;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }
    
    public Airplane getAirplane() {
        return this.airport;
    }
    
    public String getDepartureAirport() {
        return this.departureAirport;
    }
    
    public String getTargetAirport() {
        return this.targetAirport;
    }
    
    @Override
    public String toString() {
        return this.airport.toString() + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
    
    
}

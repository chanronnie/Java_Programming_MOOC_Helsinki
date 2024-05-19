/*
============== Java Programming II ==============
Part 11
Section 2 - Packages
Ex 10 - Flight Control


Implement the packages and their contents as directed by the instructions.
=================================================
*/


package FlightControl.domain;

public class Airplane {
    
    private String id;
    private int capacity;
    
    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getAirplaneID() {
        return this.id;
    } 
    
    public int getCapacity() {
        return this.capacity;
    }
    
    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " capacity)";
    }
    
}

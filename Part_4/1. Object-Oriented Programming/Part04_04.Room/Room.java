/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 4 - Room


Create a class named "Room", with two attributes (see instructions).
=================================================
*/

public class Room {
    
    private String code;
    private int seats;
    
    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }
}

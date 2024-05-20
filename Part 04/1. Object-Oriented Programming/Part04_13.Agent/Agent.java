/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 13 - Agent


Add a string representation method to the Agent class using the toString method.
=================================================
*/

public class Agent {

    // Private fields
    private String firstName;
    private String lastName;
    
    // Constructor
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
    // String representation method
    public String toString() {
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
}

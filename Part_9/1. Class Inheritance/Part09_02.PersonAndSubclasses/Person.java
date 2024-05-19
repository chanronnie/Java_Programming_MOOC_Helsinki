/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 2 - Person and subclasses


Implement classes that utilize class inheritance concepts.
=================================================
*/

public class Person {
    
    // Private fields
    private String name;
    private String address;
    
    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return this.name + "\n  " + this.address;
    }
}

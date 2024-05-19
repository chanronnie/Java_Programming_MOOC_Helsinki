/*
============== Java Programming II ==============
Part 11
Section 1 - Class diagrams
Ex 6 - Saveable person


Implement the class Person that implements the interface Saveable as described by the class diagram.
=================================================
*/

public interface Saveable {
    
    public void save();
    public void delete();
    public void load(String address);
    
}

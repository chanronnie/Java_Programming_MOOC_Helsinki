/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 8 - Cargo Hold


Implement the Item class.
=================================================
*/

public class Item {
    
    // Private fields
    private String name;
    private int weight;
    
    // Constructor
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}

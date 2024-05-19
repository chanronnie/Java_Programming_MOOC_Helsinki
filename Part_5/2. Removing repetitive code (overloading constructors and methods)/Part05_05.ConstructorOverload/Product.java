/*
============== Java Programming I ==============
Part 5
Section 2 - Removing repetitive code (overloading methods and constructors)
Ex 5 - Constructor Overload


Implement three overloading constructors in the Product class.
=================================================
*/

public class Product {

    private String name;
    private String location;
    private int weight;

    // Constructor
    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }
    
    // Overloading constructors
    public Product(String name) {
        this(name, "shelf", 1);
    }
    
    public Product(String name, String location) {
        this(name, location, 1);
    }
    
    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }
    
    // "Getter" methods
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}

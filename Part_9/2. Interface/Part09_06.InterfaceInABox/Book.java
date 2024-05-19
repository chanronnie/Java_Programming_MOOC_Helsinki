/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 6 - Interface In A Box


Implement classes that utilizes interface concept.
=======
*/

public class Book implements Packable{
    
    // Private fields
    private String author;
    private String title;
    private double weight;
    
    // Constructor
    public Book(String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.author + ": " + this.title;
    }
}

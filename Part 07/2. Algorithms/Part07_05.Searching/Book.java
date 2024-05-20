/*
============== Java Programming I ==============
Part 7
Section 2 - Algorithms
Ex 4 - Searching 


The class Book has already been implemented for the Exercise 4 - Searching.
=================================================
*/

public class Book {

    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }

}

/*
============== Java Programming I ==============
Part 8
Section 2 - Hashmap
Ex 9 - Print me another hash map


Implement a program that uses the Hashmap data structure.
=================================================
*/

public class Book {

    // Private fields
    private String name;
    private String contents;
    private int publicationYear;

    // Constructor
    public Book(String name, int publicationYear, String contents) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.contents = contents;
    }

    // Methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " (" + this.publicationYear + ")\n"
                + "Contents: " + this.contents;
    }
}

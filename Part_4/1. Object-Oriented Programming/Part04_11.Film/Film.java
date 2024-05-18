/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 11 - Film


Create a class Film.
=================================================
*/

public class Film {
    private String name;
    private int ageRating;
    
    // Constructor;
    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }
    
    public String name() {
        return this.name;
    }
    
    public int ageRating() {
        return this.ageRating;
    }    
}

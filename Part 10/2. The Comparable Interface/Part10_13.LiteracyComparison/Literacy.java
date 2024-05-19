/*
============== Java Programming II ==============
Part 10
Section 2 - The Comparable Interface
Ex 13 - Literacy comparison


Create a program that first reads the file "literacy.csv" 
and then prints the contents from the lowest to the highest ranked on the literacy rate. 
=================================================
*/

public class Literacy implements Comparable<Literacy>{
    
    // Private fields
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double rate;
    
    // Constructor
    public Literacy(String theme, String ageGroup, String gender, String country, int year, double rate) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender.trim().split(" ")[0];
        this.country = country;
        this.year = year;
        this.rate = rate;
    }
    
    public double getRate() {
        return this.rate;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.rate;
    }
    
    @Override
    public int compareTo(Literacy other) {
        if (this.getRate() > other.getRate()) {
            return 1;
        } else if (this.getRate() < other.getRate()) {
            return -1;
        }
        return 0;
    }
}

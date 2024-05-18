/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 15 - Statistics


Create a class Statistics.
=================================================
*/

public class Statistics {
    
    // Private fields
    private int count;
    private int sum;
    
    
    // Constructor
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (this.count != 0) {
            return 1.0 * this.sum / this.count;
        } else {
            return 0.0;
        }
    }
}

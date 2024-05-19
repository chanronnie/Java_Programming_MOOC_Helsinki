/*
============== Java Programming I ==============
Part 5
Section 1 - Learning object-oriented programming
Ex 4 - Fitbyte


Implement a class called "Fitbyte".
=================================================
*/

public class Fitbyte {
    
    // Private fields
    private int age;
    private int restingHeartRate;
    
    
    // Constructor
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    // Methods
    public double maximumHeartReate() {
        return 206.3 - (0.711 * this.age);
    }
   
    public double targetHeartRate(double percentageOfMaximum) {
        return (this.maximumHeartReate() - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
    }
}

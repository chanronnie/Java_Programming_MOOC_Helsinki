/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 14 - Multiplier


Create a class Multiplier.
=================================================
*/

public class Multiplier {
    private int multiplier;
    
    public Multiplier(int number) {
        this.multiplier = number;
    }
    
    public int multiply(int number) {
        return this.multiplier * number;
    }
}

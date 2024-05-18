/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 8 - Decreasing Counter


Create a class DecreasingCounter.
=================================================
*/

public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    // Constructor
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    // Methods
    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0) {
            this.value--;
        }
    }
    
    public void reset() {
        this.value = 0;
    }
}

/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 12 - Gauge


Create a class Gauge.
=================================================
*/

public class Gauge {
    
    private int value;
    
    // Constructor
    public Gauge() {
        this.value = 0;
    }
    
    public void increase() {
        if(this.value < 5) {
            this.value++;
        }
    }
            
    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }
            
    public int value() {
        return this.value;
    }
            
    public boolean full() {
        return this.value == 5;
    }
}

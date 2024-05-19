/*
============== Java Programming I ==============
Part 7
Section 1 - Programming paradigms
Ex 2 - Liquid containers with object 2.0


Implement a program that manages the contents of the containers.
Write the code in the "object-oriented programming" style.
=================================================
*/

public class Container {
    
    // Private fields
    private int volume;
    private final int max;
    
    // Constructor
    public Container() {
        this.volume = 0;
        this.max = 100;
    }
    
    // "Getter" method
    public int contains() {
        return this.volume;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.volume += amount;
        if (this.volume > this.max) {
            this.volume = this.max;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.volume -= amount;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.volume + "/100";
    }
}

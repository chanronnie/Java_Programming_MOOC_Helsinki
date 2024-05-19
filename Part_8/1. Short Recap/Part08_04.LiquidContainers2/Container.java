/*
============== Java Programming I ==============
Part 8
Section 1 - Short Recap
Ex 4 - Liquid Containers 2.0


Implement a program that manages the volume of two containers. 
This time, write it in the object-oriented programming style.
=================================================
*/

public class Container {
    
    private final int maxAmount;
    private int volume;
    
    public Container() {
        this.volume = 0;
        this.maxAmount = 100;
    }
    
    public int contains() {
        return this.volume;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.volume += amount;
        if (this.volume > maxAmount) {
            this.volume = maxAmount;
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

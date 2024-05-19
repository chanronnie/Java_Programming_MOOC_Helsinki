/*
============== Java Programming II ==============
Part 9
Section 3 - Object polymorphism
Ex 11 - Herds


Implement classes that implements the Movable interface.
=======
*/

public class Organism implements Movable {
    
    // Private fields
    private int x;
    private int y;
    
    // Constructor
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
}

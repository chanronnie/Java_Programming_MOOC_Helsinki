/*
============== Java Programming II ==============
Part 9
Section 3 - Object polymorphism
Ex 11 - Herds


Implement classes that implements the Movable interface.
=======
*/

import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    
    // Private field
    private List<Movable> herd;
    
    // Constructor
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable organism: this.herd) {
            organism.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String toPrint = "";
        for (Movable organism: this.herd) {
            toPrint += organism + "\n";
        }
        return toPrint;
    }

}

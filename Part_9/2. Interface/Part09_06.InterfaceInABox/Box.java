/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 6 - Interface In A Box


Implement classes that utilizes interface concept.
=======
*/

import java.util.ArrayList;

public class Box implements Packable{
    
    // Private fields
    private ArrayList<Packable> items;
    private double maxWeight;
    
    // Constructor
    public Box(double maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() > maxWeight) {
            return;
        }
        
        this.items.add(item);
    }
    
    @Override
    public double weight() {
        double total = 0;
        for (Packable item: this.items) {
            total += item.weight();
        }
        return total;
    }    
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

}

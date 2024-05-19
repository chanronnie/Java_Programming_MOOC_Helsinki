/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 4 - Different Kinds Of Boxes


Implement classes that utilize class inheritance and abstract class concepts.
=======
*/

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    
    // Private fields
    private int capacity;
    private ArrayList<Item> items;
    
    // Constructor
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
        
    }
    
    @Override
    public void add(Item item) {
        int newWeight = item.getWeight();
        
        // Overloaded Capacity 
        if (this.capacity - newWeight < 0) {
           return;
        }
        
        this.capacity -= newWeight;
        this.items.add(item);
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}

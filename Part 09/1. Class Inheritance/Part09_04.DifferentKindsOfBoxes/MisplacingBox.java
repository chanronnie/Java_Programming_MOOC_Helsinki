/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 4 - Different Kinds Of Boxes


Implement classes that utilize class inheritance and abstract class concepts.
=======
*/

import java.util.ArrayList;

public class MisplacingBox extends Box{
    
    private ArrayList<Item> items;
    
    public MisplacingBox() {
       this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        this.items.add(item);
    }
    
    public boolean isInBox(Item item) {
        return false;
    }
}

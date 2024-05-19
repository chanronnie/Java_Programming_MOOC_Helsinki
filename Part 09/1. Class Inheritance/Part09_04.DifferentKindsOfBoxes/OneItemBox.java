/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 4 - Different Kinds Of Boxes


Implement classes that utilize class inheritance and abstract class concepts.
=======
*/

public class OneItemBox extends Box{
    
    // Private field
    private Item singleItem;

    // Constructor
    public OneItemBox() {
    }
    
    public void add(Item item) {
        if (singleItem != null) {
            return;
        }
        
        this.singleItem = item;
    }

    public boolean isInBox(Item item) {        
        return this.singleItem != null && this.singleItem.equals(item);
    }
}

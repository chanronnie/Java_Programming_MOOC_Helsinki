/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 4 - Different Kinds Of Boxes


Implement classes that utilize class inheritance and abstract class concepts.
=======
*/

import java.util.ArrayList;

public abstract class Box {

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}

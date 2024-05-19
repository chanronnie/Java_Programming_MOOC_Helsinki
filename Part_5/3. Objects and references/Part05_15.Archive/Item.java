/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 15 - Archive


Complete the program as directed by the instructions.
=================================================
*/

public class Item {
    private String identifier;
    private String name;
    
    public Item(String id, String name) {
        this.identifier = id;
        this.name = name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item comparedItem = (Item) compared;
        return this.identifier.equals(comparedItem.identifier); 
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}

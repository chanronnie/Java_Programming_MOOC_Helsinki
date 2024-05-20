/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 8 - Cargo Hold


Implement the Hold class.
=================================================
*/

import java.util.ArrayList;

public class Hold {
    
    // Private fields
    private ArrayList<Suitcase> suitcases;
    private final int maxWeight;
    private int totalWeight;
    private int numberSuitcases;
    
    // Constructor
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
        this.numberSuitcases = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
            this.numberSuitcases++;
        }
    }
    
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight+ " kg)";
        }
        
        return this.numberSuitcases + " suitcases (" + this.totalWeight+ " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
}

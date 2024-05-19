/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 8 - Cargo Hold


Implement the Suitcase class.
=================================================
*/

import java.util.ArrayList;

public class Suitcase {
    
    // Private fields
    private ArrayList<Item> items;
    private final int maxWeight;
    private int totalWeight;
    private int numberItems;
    
    // Constructor
    public Suitcase(int weight) {
        this.items = new ArrayList<>();
        this.maxWeight = weight;
        this.totalWeight = 0;
        this.numberItems = 0;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.totalWeight += item.getWeight();
            this.numberItems++;
        }
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (int index = 1; index < this.items.size(); index++) {
            if (this.items.get(index).getWeight() > heaviest.getWeight()) {
                heaviest = this.items.get(index);
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight+ " kg)";
        }
        
        return this.numberItems + " items (" + this.totalWeight+ " kg)";
    }
    
    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }
}

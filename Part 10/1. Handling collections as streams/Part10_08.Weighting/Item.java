/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 8 - Weighting 


The Item class has already been implemented.
=================================================
*/

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + ": (" + this.weight + " kg)";
    }
}

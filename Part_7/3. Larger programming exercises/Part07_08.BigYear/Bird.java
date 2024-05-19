/*
============== Java Programming I ==============
Part 7
Section 3 - Larger programming exercises
Ex 8 - Big year


Implement an interactive program that stores birds for bird-watchers.
=================================================
*/

public class Bird {
    
    // Private fields
    private String name;
    private String nameInLatin;
    private int observations;
    
    // Constructor
    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observations = 0;
    }
  
    // Methods
    public String getName() {
        return this.name;
    }
    
    public int getObservations() {
        return this.observations;
    }
    
    public void addObservation() {
        this.observations++;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.nameInLatin + "): " + this.observations + " observations";
    }
}

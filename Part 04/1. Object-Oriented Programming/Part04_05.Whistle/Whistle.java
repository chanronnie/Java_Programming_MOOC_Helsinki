/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 5 - Whistle


Create a class named "Whistle". Add the variable private String sound to the class. 
After that, create the constructor public Whistle(String whistleSound), which is used to create a new whistle that's given a sound.
Create the method public void sound() that prints the whistle's sound
=================================================
*/

public class Whistle {
    
    // Instance variable 
    private String sound;
    
    
    // Constructor
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }
    
    // Method
    public void sound() {
        System.out.println(this.sound);
    }
}

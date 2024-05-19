/*
============== Java Programming II ==============
Part 9
Section 3 - Object polymorphism
Ex 12 - Animals


Implement the classes Dog and Cat that utilize the abstract class Animal and the interface NoiseCapable
=======
*/

public abstract class Animal{
    
    private String name;
    
    public Animal(String name) {
        this.name = name;
    };
    
    public void eat() {
        System.out.println(this.name + " eats");
    };
    
    public void sleep() {
        System.out.println(this.name + " sleeps");
    };
    
    public String getName() {
        return this.name;
    }  
}

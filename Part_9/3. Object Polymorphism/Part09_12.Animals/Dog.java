/*
============== Java Programming II ==============
Part 9
Section 3 - Object polymorphism
Ex 12 - Animals


Implement the classes Dog and Cat that utilize the abstract class Animal and the interface NoiseCapable
=======
*/

public class Dog extends Animal implements NoiseCapable{
    
    public Dog(String name) {
        super(name);
    }
    
    public Dog() {
        this("Dog");
    }
    
    public void bark() {
        System.out.println(super.getName() + " barks");
    }
    
    @Override
    public void makeNoise() {
        this.bark();
    }
}

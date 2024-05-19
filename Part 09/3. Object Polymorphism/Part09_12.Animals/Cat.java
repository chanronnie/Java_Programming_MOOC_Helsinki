/*
============== Java Programming II ==============
Part 9
Section 3 - Object polymorphism
Ex 12 - Animals


Implement the classes Dog and Cat that utilize the abstract class Animal and the interface NoiseCapable
=======
*/

public class Cat extends Animal implements NoiseCapable{
    public Cat(String name) {
        super(name);
    }
    
    public Cat() {
        this("Cat");
    }
    
    public void purr() {
        System.out.println(super.getName() + " purrs");
    }
    
    @Override
    public void makeNoise() {
        this.purr();
    }
}

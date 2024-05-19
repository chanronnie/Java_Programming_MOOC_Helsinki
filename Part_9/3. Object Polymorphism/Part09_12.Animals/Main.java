/*
============== Java Programming II ==============
Part 9
Section 3 - Object polymorphism
Ex 12 - Animals


Implement the classes Dog and Cat that utilize the abstract class Animal and the interface NoiseCapable
=======
*/

public class Main {

    public static void main(String[] args) {
        NoiseCapable dog = new Dog();
        dog.makeNoise();
        
        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }
}

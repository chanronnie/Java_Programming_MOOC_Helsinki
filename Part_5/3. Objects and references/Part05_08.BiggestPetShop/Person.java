/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 8 - Biggest Pet Shop


Create a Person class that also uses the Pet class.
=================================================
*/

public class Person {

    // Private fields
    private String name;
    private Pet pet;

    // Constructor
    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    public Person() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    @Override
    public String toString() {
        return this.name + ", has a friend called " + this.pet.getName() + " (" + this.pet.getBreed() + ")" ;
    }

}

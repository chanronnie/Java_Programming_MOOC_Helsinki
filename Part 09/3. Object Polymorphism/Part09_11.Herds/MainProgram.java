/*
============== Java Programming II ==============
Part 9
Section 3 - Object polymorphism
Ex 11 - Herds


Implement classes that implements the Movable interface.
=======
*/

public class MainProgram {

    public static void main(String[] args) {
        Organism org = new Organism(20, 30);
        System.out.println(org);
        org.move(-10, 5);
        System.out.println(org);
        org.move(50, 20);
        System.out.println(org);
        System.out.println("");
        
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
    }
}

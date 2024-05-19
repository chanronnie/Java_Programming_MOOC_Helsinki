/*
============== Java Programming II ==============
Part 10
Section 2 - The Comparable Interface
Ex 11 - Wage Order


Implement the class Human that uses the interface Comparable.
=================================================
*/

import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Matti", 150000));
        humans.add(new Human("Merja", 500));
        humans.add(new Human("Pertti", 80));

        System.out.println(humans);

        Collections.sort(humans);
        System.out.println(humans);

    }
}

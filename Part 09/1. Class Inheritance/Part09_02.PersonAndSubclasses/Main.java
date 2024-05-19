/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 2 - Person and subclasses


Implement classes that utilize class inheritance concepts.
=================================================
*/

import java.util.ArrayList;

public class Main {

    // Main program
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    // Method
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person: persons) {
            System.out.println(person);
        }
    }
}

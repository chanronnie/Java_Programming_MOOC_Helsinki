/*
============== Java Programming II ==============
Part 10
Section 2 - The Comparable Interface
Ex 11 - Wage Order


Implement the class Human that uses the interface Comparable.
=================================================
*/

public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return name + " " + wage;
    }
    
    @Override
    public int compareTo(Human human) {
        return human.getWage() - this.getWage();
    }
}

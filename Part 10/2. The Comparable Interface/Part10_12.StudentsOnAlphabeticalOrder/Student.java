/*
============== Java Programming II ==============
Part 10
Section 2 - The Comparable Interface
Ex 12 - Students on alphabetical order


Implement the class Student that uses the interface Comparable.
=================================================
*/

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student other) {
        return this.getName().compareTo(other.getName()); 
    }
}

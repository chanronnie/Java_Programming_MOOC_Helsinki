/*
============== Java Programming II ==============
Part 10
Section 2 - The Comparable Interface
Ex 12 - Students on alphabetical order


Implement the class Student that uses the interface Comparable.
=================================================
*/

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
  
    }   
}

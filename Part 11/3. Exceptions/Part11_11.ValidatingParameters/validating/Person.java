/*
============== Java Programming II ==============
Part 11
Section 3 - Exzceptions
Ex 11 - validating parameters


Implement a program that handles invalid input given by the user by throwing Exceptions.
=================================================
*/

package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        
        if (name == null || name.isEmpty() || name.length() > 40)  {
            throw new IllegalArgumentException("The person name should not be left empty and it must have a max. of 40 characters.");
        }
        
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("The person age must be between 0 and 120.");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

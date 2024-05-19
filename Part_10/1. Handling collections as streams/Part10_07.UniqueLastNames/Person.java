/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 7 - Unique last names


The Person class has already been implemented.
=================================================
*/

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

}

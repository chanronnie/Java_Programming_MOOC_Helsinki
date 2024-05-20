/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 29 - Records From A File


The Person class has already been implemented.
=================================================
*/

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }

}

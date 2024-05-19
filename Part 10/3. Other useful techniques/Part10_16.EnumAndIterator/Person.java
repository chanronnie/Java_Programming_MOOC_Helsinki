/*
============== Java Programming II ==============
Part 10
Section 3 - Other useful techniques
Ex 16 - Enum and Iterator


Create a program that manages an employee database using the concepts of enum and iterator. 
The database should include the names of the employees along with their highest level of education.
=================================================
*/

public class Person {
 
    // Private fields
    private String name;
    private Education education;
    
    // Constructor
    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }
    
    public Education getEducation() {
        return this.education;
    }
    
    public String toString() {
        return this.name + ", " + this.education;
    }
}

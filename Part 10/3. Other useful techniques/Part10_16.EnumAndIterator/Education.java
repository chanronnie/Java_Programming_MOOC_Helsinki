/*
============== Java Programming II ==============
Part 10
Section 3 - Other useful techniques
Ex 16 - Enum and Iterator


Create a program that manages an employee database using the concepts of enum and iterator. 
The database should include the names of the employees along with their highest level of education.
=================================================
*/

public enum Education {
    
    PHD("Doctoral degree"), 
    MA("Masters degree"), 
    BA("Bachelors degree"),
    HS("High School diploma");
    
    private String educationName;
    
    // Constructor
    private Education(String educationName) {
        this.educationName = educationName;
    }
    
    private String getEducation() {
        return this.educationName;
    }
}

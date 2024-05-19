/*
============== Java Programming I ==============
Part 6
Section 3 - Introduction to testing
Ex 13 - Exercises


Implement the Testing class for testing the functionality of ExerciseManagement class.
=================================================
*/

public class Exercise {
    private String name;
    private boolean completed;
   
    public Exercise(String name) {
       this.name = name;
       this.completed = false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public boolean isCompleted() {
        return this.completed;
    }
}

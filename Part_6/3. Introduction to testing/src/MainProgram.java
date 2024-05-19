/*
============== Java Programming I ==============
Part 6
Section 3 - Introduction to testing
Ex 13 - Exercises


Implement a program that tests the functionality of the ExerciseManagement class.
=================================================
*/

public class MainProgram {
    
    public static void main(String[] args) {
        ExerciseManagement exercises = new ExerciseManagement();
        System.out.println(exercises.exerciseList());
        exercises.printStatus();
        
        exercises.add("Write a Java code");
        exercises.add("Write a Python code");
        exercises.add("Write a SQL code");
        exercises.printStatus();
        
        exercises.markAsCompleted("Write a Java code");
        exercises.printStatus();
        
    }
    
    public static int partsCompleted() {
        return 2;
    }
}

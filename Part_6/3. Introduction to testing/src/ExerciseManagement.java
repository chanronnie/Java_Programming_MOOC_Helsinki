/*
============== Java Programming I ==============
Part 6
Section 3 - Introduction to testing
Ex 13 - Exercises


Implement the ExerciseManagement class.
=================================================
*/

import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: this.exercises) {
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercise question: this.exercises) {
            if (question.getName().equals(exercise)) {
                question.setCompleted(true);
            }
        }       
    }
    
    public boolean isCompleted(String exercise) {
        for (Exercise question: this.exercises) {
            if (question.getName().equals(exercise)) {
                return question.isCompleted();
            }
        }  
        return false;
    }
        
    public void printStatus() {
        System.out.println("--- Printing Status --- ");
        
        if (this.exercises.isEmpty()) {
            System.out.println("No exercises have been added to the database at the moment ...");
            System.out.println();
            return;
        }
        
        int completed = 0;
        for (Exercise ex: this.exercises) {
            if (ex.isCompleted()) {
                System.out.println(ex.getName() + ": Completed");
                completed++;
            } else {
                System.out.println(ex.getName() + ": Not Completed");
            }
        }
        System.out.println("Completion ratio: " + completed + " / " + this.exercises.size());
        System.out.println();
    }
}

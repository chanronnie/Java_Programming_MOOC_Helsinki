/*
============== Java Programming I ==============
Part 6
Section 3 - Introduction to testing
Ex 13 - Exercises


Implement the Testing class for testing the functionality of ExerciseManagement class.
=================================================
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;


public class ExerciseManagementTest {
    ExerciseManagement management;
    
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListIsEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test 
    public void addingExerciseGrowListByOne() {
        management.add("New exercise");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        management.add("New exercise");
        assertTrue(management.exerciseList().contains("New exercise"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
}

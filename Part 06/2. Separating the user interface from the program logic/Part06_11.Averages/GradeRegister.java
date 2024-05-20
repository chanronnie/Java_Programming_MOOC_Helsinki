/*
============== Java Programming I ==============
Part 6
Section 2 - Separating the user interface from program logic
Ex 11 - Averages


Complete the implementation of the GradeRegister class.
=================================================
*/

import java.util.ArrayList;

public class GradeRegister {

    // Private fields
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    // Constructor
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    // Methods
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        
        double sum = 0.0;
        for (int grade: this.grades) {
            sum += grade;
        }
        return 1.0 * sum / this.grades.size();
    }   
    
    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
        
        double sum = 0.0;
        for (int points: this.points) {
            sum += points;
        }
        return 1.0 * sum / this.points.size();
    }
}

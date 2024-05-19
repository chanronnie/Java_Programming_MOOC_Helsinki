/*
============== Java Programming I ==============
Part 7
Section 3 - Larger programming exercises
Ex 5 - Grade statistics 

Implement a program for registering points/grades.
=================================================
*/

import java.util.ArrayList;

public class GradeRegister {
    
    // Private fields
    private ArrayList<Integer> allPoints;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;
    
    // Constructor
    public GradeRegister() {
        this.allPoints = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    // Methods
    public void addPoints(int points) {
        if (points < 0 || points > 100) {
            return;
        }
        
        this.grades.add(pointsToGrades(points));
        this.allPoints.add(points);
        if (points >= 50) {
            this.passingPoints.add(points);
        }
    }
    
    public int pointsToGrades(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }
    
    public String pointAverage(ArrayList<Integer> coursePoints) {
        if (coursePoints.isEmpty()) {
            return "-";
        }
        
        int sum = 0;
        for (int pts: coursePoints) {
            sum += pts;
        }
        return "" + 1.0 * sum / coursePoints.size();
    }
    
    public String passingPercentage() {
        if (this.passingPoints.isEmpty()) {
            return "-";
        }
        return "" + 100.0 * this.passingPoints.size() / this.allPoints.size();
    }
    
    public void printGradeDistribution() {
        // Print the averages
        System.out.println("Point average (all): " + pointAverage(allPoints));
        System.out.println("Point average (passing): " + pointAverage(passingPoints));
        System.out.println("Pass percentage: " + passingPercentage()); 
        
        // Print the grade distribution
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");

            for (int j = 0; j < this.grades.size(); j++) {
                if (this.grades.get(j) == grade) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}

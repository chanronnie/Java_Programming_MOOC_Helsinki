/*
============== Java Programming I ==============
Part 7
Section 3 - Larger programming exercises
Ex 5 - Grade statistics 

Implement a program for registering points/grades.
=================================================
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GradeRegister gradeRegister = new GradeRegister();
        
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            
            gradeRegister.addPoints(points);
        }
        
        gradeRegister.printGradeDistribution();
    }
}

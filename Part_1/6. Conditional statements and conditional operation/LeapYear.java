/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 36 - Leap Year


A year is a leap year if it is divisible by 4. 
However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
Write a program that reads a year from the user, and checks whether or not it is a leap year.
=================================================
*/

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        

        if (year % 100 == 0) {
            
            // Check if the century year is divisible by 400            
            if (year % 400 == 0) {       
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
          
        } else if (year % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}

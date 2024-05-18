/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 35 - Checking the Age


Write a program that prompts the user to input their age 
and checks whether or not it is possible (at least 0 and at most 120). 
Only use a single if-command in your program.
=================================================
*/

import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user for an age
        System.out.print("How old are you? ");
        int age = Integer.valueOf(scan.nextLine());
        
        // Check the age
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}

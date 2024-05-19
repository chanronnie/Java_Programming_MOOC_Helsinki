/*
============== Java Programming II ==============
Part 10
Section 3 - Other useful techniques
Ex 15 - Regular expressions


Create a program that checks the format of given string using regular expressions.
=================================================
*/

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scan.nextLine();
        
        Checker checker = new Checker();
        
        if (checker.isDayOfWeek(string)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
        if (checker.allVowels(string)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
        if (checker.timeOfDay(string)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
 
    }
}

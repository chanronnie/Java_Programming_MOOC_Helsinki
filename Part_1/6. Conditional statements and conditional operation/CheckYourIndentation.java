/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 25 - Check Your Indentation


Given the exercise program, correct any indentation errors that are present in the code.
=================================================
*/

import java.util.Scanner;

public class CheckYourIndentation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user for two numbers
        System.out.println("Give a number: ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give another number: ");
        int second = Integer.valueOf(scan.nextLine());
        
        // Check the numbers
        if (first == second) { 
            System.out.println("Same!");
        } else if (first > second) { 
            System.out.println("The first was larger than the second!");
        } else { 
            System.out.println("The second was larger than the first!");
        }
    }
}

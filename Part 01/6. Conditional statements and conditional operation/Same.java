/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 34 - Same

 
Write a program that prompts the user for two strings. 
If the strings are the same, then the program prints "Same". 
Otherwise, it prints "Different".
=================================================
*/

import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user for two strings
        System.out.println("Enter the first string:");
        String first = scan.nextLine();
        System.out.println("Enter the second string:");
        String second = scan.nextLine();
        
        // Check strings
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}

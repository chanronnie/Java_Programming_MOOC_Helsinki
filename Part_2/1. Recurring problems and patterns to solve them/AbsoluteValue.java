/*
============== Java Programming I ==============
Part 2
Section 1 - Recurring problems and patterns
Ex 3 - Absolute Value


Write a program that reads an integer from the user and prints its absolute value.
=================================================
*/

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a number
        System.out.println("Give a number for which you would like to find the absolute value:");
        int num = Integer.valueOf(scanner.nextLine());
        
        // Output the absolute value
        if (num < 0) {
            System.out.println(num*-1);
        } else {
            System.out.println(num);
        }
    }
}

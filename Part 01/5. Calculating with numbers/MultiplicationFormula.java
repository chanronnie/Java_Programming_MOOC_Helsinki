/*
============== Java Programming I ==============
Part 1
Section 5 - Calculating with numbers
Ex 20 - Multiplication Formula


Write a program that prompts the user for two integers 
and prints their multiplication formula using the "*" and "=" signs.
=================================================
*/

import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Output the formula
        System.out.println(first + " * " + second + " = " + (first*second));

    }
}

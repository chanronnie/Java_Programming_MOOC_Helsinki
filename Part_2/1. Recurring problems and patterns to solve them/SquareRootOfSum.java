/*
============== Java Programming I ==============
Part 2
Section 1 - Recurring problems and patterns
Ex 2 - Square Root Of Sum


Write a program that reads two integers from the user and 
prints the square root of the sum of these integers. 
The program does not need to work with negative values.
=================================================
*/

import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for two integers
        System.out.println("Give the first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        // Output the result using the Math.sqrt command in "integer" type
        System.out.println("The square root of their sum is " + (int) Math.sqrt(firstNumber + secondNumber));

    }
}

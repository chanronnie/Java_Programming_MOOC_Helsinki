/*
============== Java Programming I ==============
Part 1
Section 5 - Calculating with numbers
Ex 23 - Simple Calculator


Write a program that prompts the user for two integers 
and prints their addition, difference, multiplication, and division formulas.
=================================================
*/

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Output the addition, difference, multiplication and division formulas
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + (1.0 * first / second));
    }
}

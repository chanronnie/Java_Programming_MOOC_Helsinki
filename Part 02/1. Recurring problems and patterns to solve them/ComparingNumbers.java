/*
============== Java Programming I ==============
Part 2
Section 1 - Recurring problems and patterns
Ex 4 - Comparing Numbers


Write a program that reads two integers from the user, compares it and prints the result.
=================================================
*/

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for two integers
        System.out.println("Give the first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        // Output the result
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber + ".");
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is smaller than " + secondNumber + ".");
        } else {
            System.out.println(firstNumber + " is equal to " + secondNumber + ".");
        }
    }
}

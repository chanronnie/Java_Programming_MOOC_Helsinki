/*
============== Java Programming I ==============
Part 1
Section 5 - Calculating with numbers
Ex 18 - Sum of Three Numbers


Write a program that prompts the user for three integers and prints their sum.
=================================================
*/

import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for three integers
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());
        
        // Output their sum
        System.out.println("The sum of the numbers is " + (first + second + third));
    }
}

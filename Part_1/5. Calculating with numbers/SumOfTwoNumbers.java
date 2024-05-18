/*
============== Java Programming I ==============
Part 1
Section 5 - Calculating with numbers
Ex 17 - Sum of Two Numbers


Write a program that prompts the user for two integers and prints their sum.
=================================================
*/

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Output their sum
        System.out.println("The sum of the numbers is " + (first + second));
    }
}

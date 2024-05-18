/*
============== Java Programming I ==============
Part 1
Section 5 - Calculating with numbers
Ex 22 - Average of Three Numbers


Write a program that prompts the user for three integers and prints their average.
=================================================
*/

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for three integers
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());
        
        // Output their average 
        System.out.println("The average is " + (1.0 * first + second + third) / 3);
        
        

    }
}

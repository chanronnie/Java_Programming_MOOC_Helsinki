/*
============== Java Programming I ==============
Part 2
Section 2 - Repeating functionality
Ex 11 - Number and Sum of Numbers


Write a program that asks the user for input until the user inputs 0. 
After this the program prints the amount of numbers inputted and the sum of the numbers. 
The number zero does not need to be added to the sum, but adding it does not change the results.
=================================================
*/

import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            counter += 1;
            sum += number;
        } // end of loop
        
        // Output the results
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);
    }
}

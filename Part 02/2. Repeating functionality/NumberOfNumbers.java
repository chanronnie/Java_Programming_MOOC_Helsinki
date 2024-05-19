/*
============== Java Programming I ==============
Part 2
Section 2 - Repeating functionality
Ex 8 - Number of Numbers


Write a program that reads values from the user until they input a 0. 
After this, the program prints the total number of inputted values. 
The zero that's used to exit the loop should not be included in the total number count.
=================================================
*/

import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        while (true) {
            
            // Prompt the user for a number
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            // Exit loop if input is 0
            if (input == 0) {
                break;
            }
            
            // For any non-zero number, increment the counter by 1
            counter += 1;
        } 
        
        // Output the total number count (other than 0)
        System.out.println("Number of numbers: " + counter);
    }
}

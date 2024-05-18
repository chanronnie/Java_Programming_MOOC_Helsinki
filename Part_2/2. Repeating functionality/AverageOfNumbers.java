/*
============== Java Programming I ==============
Part 2
Section 2 - Repeating functionality
Ex 12 - Average of Numbers


Write a program that asks the user for input until the user inputs 0. 
After this, the program prints the average of the numbers. 
The number zero does not need to be counted to the average. 
You may assume that the user inputs at least one number.
=================================================
*/

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            counter += 1;
            sum += number;
        } //  end of loop
        
        // Output the average
        System.out.println("Average of the numbers: " + (1.0 * sum / counter));
    }
}

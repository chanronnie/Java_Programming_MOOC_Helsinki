/*
============== Java Programming I ==============
Part 2
Section 2 - Repeating functionality
Ex 10 - Sum of Numbers


Write a program that reads numbers from the user until the user inputs a number 0. 
After this the program outputs the sum of the numbers. 
The number zero does not need to be added to the sum, even if it does not change the results.
=================================================
*/

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            sum += number;
        } // end of loop
        
        // Output the sum
        System.out.println("Sum of the numbers: " + sum);
    }
}

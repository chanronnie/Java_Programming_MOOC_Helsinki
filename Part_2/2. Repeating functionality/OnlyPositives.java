/*
============== Java Programming I ==============
Part 2
Section 2 - Repeating functionality
Ex 7 - Only Positives


Write a program that asks the user for numbers. 
If the number is negative (smaller than zero), the program prints for user "Unsuitable number" and asks the user for a new number. 
If the number is zero, the program exits the loop. 
If the number is positive, the program prints the number to the power of two.
=================================================
*/

import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            // Prompt the user for a number
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number < 0) {
                System.out.println("Unsuitable number"); // For negative number, ask for another number 
            } else if (number > 0) {
                System.out.println(number * number);     // For positive number, output the number to the power of two 
            } else {
                break;                                   // Exit the loop if input is 0.
            } 
        }
    }
}

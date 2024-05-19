/*
============== Java Programming I ==============
Part 2
Section 2 - Repeating functionality
Ex 9 - Number of Negative Numbers


Write a program that reads values from the user until they input a 0. 
After this, the program prints the total number of inputted values that are negative. 
The zero that's used to exit the loop should not be included in the total number count.
=================================================
*/

import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            if (input < 0) {
                counter += 1;
            }
        } // end of loop
        
        System.out.println("Number of negative numbers: " + counter);
    }
}

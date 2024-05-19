/*
============== Java Programming I ==============
Part 2
Section 2 - Repeating functionality
Ex 13 - Average Of Positive Numbers


Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the positive numbers.
If no positive number is inputted, the program prints "Cannot calculate the average"
=================================================
*/

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                counter += 1;
                sum += number;
            }
        } // end of loop
        
        // Output the result
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else { 
            System.out.println(1.0 * sum / counter);
        }
    }
}

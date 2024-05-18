/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 15 - Statistics


Create a class Statistics and implement a program as directed by the instructions.
=================================================
*/

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create Statistics objects
        Statistics allNumbers = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        // Read the numbers from the user
        System.out.println("Enter numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            allNumbers.addNumber(number);
            if (number % 2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }
        
        // Output the summary
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}

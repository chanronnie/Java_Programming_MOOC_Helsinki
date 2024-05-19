/*
============== Java Programming I ==============
Part 3
Section 4 - Using strings
Ex 30 - Age Of The Oldest


Write a program that reads names and ages from the user until an empty line is entered. 
The name and age are separated by a comma.
After reading all user input, the program prints the age of the oldest person. 
You can assume that the user enters at least one person, and that one of the users is older than the others.
=================================================
*/

import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            // Split the input into name and age 
            // Find the age of the oldest
            String[] parts = input.split(",");
            if (oldest < Integer.valueOf(parts[1])) {
                oldest = Integer.valueOf(parts[1]);
            }
        }
        
        // Output the result
        System.out.println("Age of the oldest: " + oldest);
    }
}

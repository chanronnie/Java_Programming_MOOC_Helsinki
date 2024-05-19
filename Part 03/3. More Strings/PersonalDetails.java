/*
============== Java Programming I ==============
Part 3
Section 4 - Using strings
Ex 32 - Personal Details


Write a program that reads names and birth years from the user until an empty line is entered. 
The name and birth year are separated by a comma.

After that the program prints the longest name and the average of the birth years. 
If multiple names are equally longest, you can print any of them. 
You can assume that the user enters at least one person.
=================================================
*/

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        double sum = 0;
        int count = 0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            String name = parts[0];
            
            if (longestName.length() < name.length()) {
                longestName = name;
            }
            
            // Perform computations for the birth years average
            sum += Double.valueOf(parts[1]);
            count++;
        }
        
        // Output the result
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + sum / count);
    }
}

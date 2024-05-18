/*
============== Java Programming I ==============
Part 3
Section 4 - Using strings
Ex 31 - Name Of The Oldest


Write a program that reads names and ages from the user until an empty line is entered. 
The name and age are separed by a comma.
After reading all user input, the program prints the name of the oldest person. 
You can assume that the user enters at least one person, and the that one of the users is older than the others.
=================================================
*/

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ageOfTheOldest = 0;
        String nameOfTheOldest = "";
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            } 
            
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            if (ageOfTheOldest < age) {
                ageOfTheOldest = age;
                nameOfTheOldest = parts[0];
            }
        }
        
        // Output the result
        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}

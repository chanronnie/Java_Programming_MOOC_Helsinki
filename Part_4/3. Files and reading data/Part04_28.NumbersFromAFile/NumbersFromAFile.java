/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 28 - Numbers From A File


Create a program that searches for user input in a file.
=================================================
*/

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        
        // Read inputs from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        // Read file contents
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            int count = 0;
            while (fileReader.hasNextLine()) {
                int number = Integer.valueOf(fileReader.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
            
            System.out.println("Numbers: " + count);
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}

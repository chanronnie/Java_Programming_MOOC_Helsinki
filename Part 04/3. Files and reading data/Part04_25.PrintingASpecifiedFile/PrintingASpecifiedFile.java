/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 25 - Printing a specified file


Create a program that reads and prints the contents of the given file.
=================================================
*/

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        
        // Read the file name from the user
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printer?");
        String fileName = inputScanner.nextLine();
        
        // Prints the contents of the file
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

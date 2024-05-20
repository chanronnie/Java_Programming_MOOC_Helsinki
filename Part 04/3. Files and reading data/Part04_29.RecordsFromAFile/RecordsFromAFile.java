/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 29 - Records From A File


Create a program that prompts the user for a file to read and outputs its content in the following format:
Name, age: [age] years(s)
=================================================
*/

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        
        // Prompt the user for a file name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        // Read the contents of the file
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            while (fileReader.hasNextLine()) {
                
                // Read the line and store data into arrays and variables
                String[] data = fileReader.nextLine().split(",");
                String name = data[0];
                int age = Integer.valueOf(data[1]);
                
                // Output the contents of the line
                System.out.print(name + ", age: " + age);
                if (age == 1) {
                    System.out.println(" year");
                } else {
                    System.out.println(" years");
                }                
            }
        
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}

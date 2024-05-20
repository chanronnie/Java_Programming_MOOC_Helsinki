/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 27 - Is It In The File


Create a program that searches for user input.
=================================================
*/

import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        
        // Read inputs from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        // Read contents from the file
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            boolean found = false;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.contains(searchedFor)) {
                    found = true;
                    break;
                }
            }

            // Output the search result
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}

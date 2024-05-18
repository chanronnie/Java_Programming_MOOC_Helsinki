/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 24 - Printing a file


Create a program that reads and prints the contents of the file "data.txt".
=================================================
*/

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try (Scanner fileReader = new Scanner(Paths.get("data.txt"))) {
            
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}

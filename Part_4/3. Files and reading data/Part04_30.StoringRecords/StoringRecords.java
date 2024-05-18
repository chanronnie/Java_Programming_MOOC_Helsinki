/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 30 - Storing Records


Implement a program that reads and prints the contents of a given file by using the Person class.
=================================================
*/

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    // Main program
    public static void main(String[] args) {
        
        // Prompt the user for a file
        Scanner scan = new Scanner(System.in);
        System.out.println("Filename:");
        String file = scan.nextLine();

        // Read and prints the contents of the file 
        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);
        }
    }

    // Method
    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Read the file passed as a parameter
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] dataParts =  line.split(",");
                String name = dataParts[0];
                int age = Integer.valueOf(dataParts[1]);
                
                persons.add(new Person(name, age));
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        return persons;
    }
}

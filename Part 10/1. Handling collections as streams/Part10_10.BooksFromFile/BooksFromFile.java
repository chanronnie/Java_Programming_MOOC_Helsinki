/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 10 - Books from file


Implement a static method that reads a given file, extracts data line by line, and stores it in a list of Book objects.
=================================================
*/

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    // Main program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    
    // Class method
    public static List<Book> readBooks(String file) {        
        try{
            return Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return new ArrayList<>();
    }

}

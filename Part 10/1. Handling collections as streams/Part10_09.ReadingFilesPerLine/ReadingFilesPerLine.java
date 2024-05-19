/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 9 - Reading Files Per Line 


Implement a static method that reads a given filename line by line and returns all lines as a string list.
=================================================
*/

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    // Main program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    }
    
    // Class method
    public static List<String> read(String file){
        
        try {
            return Files.lines(Paths.get(file)).collect(Collectors.toList());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return new ArrayList<>();
    }
}

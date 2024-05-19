/*
============== Java Programming II ==============
Part 10
Section 2 - The Comparable Interface
Ex 13 - Literacy comparison


Create a program that first reads the file "literacy.csv" 
and then prints the contents from the lowest to the highest ranked on the literacy rate. 
=================================================
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    
    // Main program
    public static void main(String[] args) {
        
        ArrayList<Literacy> literacy = readLinesFromFile("literacy.csv");
        
        literacy.stream()
                .sorted((data1, data2) -> data1.compareTo(data2))
                .forEach(data -> System.out.println(data));

    }
    
    // Class method
    public static ArrayList<Literacy> readLinesFromFile(String fileName) {
        
        ArrayList<Literacy> literacy = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(fileName))
                 .map(line -> line.split(","))
                 .map(parts -> new Literacy(parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                 .forEach(data -> literacy.add(data));
        
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
       
        return literacy;
    }
}

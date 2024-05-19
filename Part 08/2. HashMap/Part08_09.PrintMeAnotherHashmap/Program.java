/*
============== Java Programming I ==============
Part 8
Section 2 - Hashmap
Ex 9 - Print me another hash map


Implement a program that uses the Hashmap data structure.
=================================================
*/

import java.util.HashMap;

public class Program {

    // Main program
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
    
    // Class methods
    public static void printValues(HashMap<String,Book> hashmap) {
        for (Book book: hashmap.values()) {
            System.out.println(book);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        String searchedText = text.toLowerCase().trim();
        for (Book book: hashmap.values()) {
            if (book.getName().contains(searchedText)) {
                System.out.println(book);
            }
        }
    }
}

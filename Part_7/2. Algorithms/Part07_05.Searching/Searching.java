/*
============== Java Programming I ==============
Part 7
Section 2 - Algorithms
Ex 4 - Searching 


Implement class methods for each of the searching algorithms: Linear Search and Binary Search.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;


public class Searching {

    // Main program
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        // Request book information from the user
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }
        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        for (Book book: books) {
            System.out.println(book);
        }
       
        // Perform Linear search
        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        
        // Perform binary search
        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }     
    }

    
    // Class methods
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = 0;
        while (index < books.size()) {
            if (books.get(index).getId() == searchedId) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int start = 0;
        int end = books.size() - 1;
        
        while (start <= end) {
            int middle = (start + end) / 2;
            int idAtMiddle = books.get(middle).getId();
            
            if (idAtMiddle == searchedId) {
                return middle;
            }
            
            if (idAtMiddle > searchedId) {
                end = middle - 1;
            }
            
            if (idAtMiddle < searchedId) {
                start = middle + 1;
            }
        }
        return -1;
    }
}


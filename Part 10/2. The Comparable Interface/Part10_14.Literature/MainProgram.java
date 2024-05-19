/*
============== Java Programming II ==============
Part 10
Section 2 - The Comparable Interface
Ex 14 - Literature


Create a program that prompts the user for book information (title and age recommendation) 
and then outputs the total number of given books, followed by book information sorted by age recommendation and then by title.
=================================================
*/

import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Request book informations from user
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, age));
        }
        
        // Output the book information
        System.out.println(books.size() + " books in total.");
        System.out.println("\nBooks:");
        books.stream().sorted().forEach(book -> System.out.println(book));
    }

}

/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 14 - Books


Complete the program as directed by the instructions.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            
            // Prompt the user for the book information
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            
            // Add only unique books to list 
            Book book = new Book(name, publicationYear);
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book);
            }  
        }
         
        System.out.println("Thank you! Books added: " + books.size());
    }
}

/*
============== Java Programming I ==============
Part 4
Section 2 - Objects in a list
Ex 20 - Book


Implement a program that uses the Book class, as directed by the instructions.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Read book informations from the user
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages,publicationYear));
        }
        
        // Print the given information
        System.out.println("");
        System.out.println("What information will be printed? ");
        String infoToPrint = scanner.nextLine();
        
        for (Book book: books) {
            if (infoToPrint.equals("everything")) {
                System.out.println(book);
            } else if (infoToPrint.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}

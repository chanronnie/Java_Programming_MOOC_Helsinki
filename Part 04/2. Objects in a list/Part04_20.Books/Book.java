/*
============== Java Programming I ==============
Part 4
Section 2 - Objects in a list
Ex 20 - Book


Create the Book class
=================================================
*/

public class Book {
    
    // Private fields
    private String title;
    private int pages;
    private int publicationYear;
    
    // Constructor
    public Book(String bookTitle, int numberOfPages, int bookPublicationYear) {
        this.title = bookTitle;
        this.pages = numberOfPages;
        this.publicationYear = bookPublicationYear;
    }
    
    // "Getter" methods
    public String getTitle() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
        
    public int getPublicationYear() {
        return this.publicationYear;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }  
}

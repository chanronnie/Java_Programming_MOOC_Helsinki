/*
============== Java Programming I ==============
Part 5
Section 1 - Learning object-oriented programming
Ex 2 - Book


Implement a class called "Book".
=================================================
*/

public class Book {
    
    // Private fields
    private String author;
    private String name;
    private int pages;
    
    // Constructor
    public Book(String bookAuthor, String bookName, int numberPages) {
        this.author = bookAuthor;
        this.name = bookName;
        this.pages = numberPages;
    }
    
    // "Getter" methods
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    @Override
    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}

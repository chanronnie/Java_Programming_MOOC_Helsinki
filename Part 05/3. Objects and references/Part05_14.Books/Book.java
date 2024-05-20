/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 14 - Books


Implement the Book class.
=================================================
*/

public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        
        // Compare the reference
        if (this == compared) {
            return true;
        }
        
        // Compare the object type 
        if (!(compared instanceof Book)) {
            return false;
        }
        
        // Compare each variable of both objects
        Book comparedBook = (Book) compared;
        if (this.name.equals(comparedBook.name) &&
            this.publicationYear == comparedBook.publicationYear) {
            return true;
        }
        
        // Otherwise the objects are not equals
        return false;
    }
}

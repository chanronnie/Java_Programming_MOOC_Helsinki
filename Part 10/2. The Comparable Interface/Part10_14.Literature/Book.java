/*
============== Java Programming II ==============
Part 10
Section 2 - The Comparable Interface
Ex 14 - Literature


Create a program that prompts the user for book information (title and age recommendation) 
and then outputs the total number of given books, followed by book information sorted by age recommendation and then by title.
=================================================
*/

public class Book implements Comparable<Book> {
    
    private String title;
    private int ageRecomendation;
    
    public Book(String title, int ageRecomendation) {
        this.title = title;
        this.ageRecomendation = ageRecomendation;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getAgeRecommendation() {
        return this.ageRecomendation;
    }
    
    @Override
    public String toString() {
        return this.title + " (recommended for " + this.ageRecomendation + " year-olds or older)";
    }
    
    @Override
    public int compareTo(Book other) {
        
        // For books having the same age recommendation - sort by title
        if (this.getAgeRecommendation() == other.getAgeRecommendation()) {
            return this.getTitle().compareTo(other.getTitle());
        }
        
        // Sort by age recommendation
        return this.getAgeRecommendation() - other.getAgeRecommendation();
    }
}

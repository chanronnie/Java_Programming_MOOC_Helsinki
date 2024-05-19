/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 11 - Comparing apartments


Implement the Apartment class
=================================================
*/

public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int price() {
        return this.squares * this.pricePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.price() - compared.price());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.price() > compared.price();
    }
}

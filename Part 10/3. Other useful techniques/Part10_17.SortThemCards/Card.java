/*
============== Java Programming II ==============
Part 10
Section 3 - Other useful techniques
Ex 17 - Sort them cards!


Create a program that manages an employee database using the concepts of enum and iterator. 
The database should include the names of the employees along with their highest level of education.
=================================================
*/

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        
        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }
    
    @Override
    public int compareTo(Card other) {
        if (this.getValue() == other.getValue()) {
            return this.getSuit().compareTo(other.getSuit());
        }
            
        return this.getValue() - other.getValue();
    }

}

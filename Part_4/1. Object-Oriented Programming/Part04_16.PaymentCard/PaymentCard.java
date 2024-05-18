/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 16 - Payment Card


Create a class PaymentCard.
=================================================
*/

public class PaymentCard {
    
    // Private fields
    private double balance;
    private final double affordable = 2.60;
    private final double hearty = 4.60;
    
    // Constructor
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        if (this.balance >= affordable) {
            this.balance -= affordable;
        }
    }

    public void eatHeartily() {
        if (this.balance >= hearty) {
            this.balance -= hearty;
        }
    }
    
    public void addMoney(double amount) { 
        
        if (amount < 0) {
            return;
        }
        
        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        } 
    }
}

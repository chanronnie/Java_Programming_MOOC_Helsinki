/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 9 - Debt


Create a class Debt.
=================================================
*/

public class Debt {
    
    // Private fields
    private double balance;
    private double interestRate;
    
    // Constructor
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance *= this.interestRate;
    }
}

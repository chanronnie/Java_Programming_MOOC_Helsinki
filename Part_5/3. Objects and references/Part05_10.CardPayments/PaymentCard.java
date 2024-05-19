/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 10 - Payment Card


Implement the PaymentCard class.
=================================================
*/ 

public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        if (increase > 0) {
            this.balance += increase;
        }
    }

    public boolean takeMoney(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}

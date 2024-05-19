/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 3 - Warehousing 


Implement classes that utilize class inheritance concepts.
=================================================
*/

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {                           // Invalid input
            return;
        }
        
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;   // Available spaces to fill in
        } else {
            this.balance = this.capacity;           // Overflow
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {                           // Invalid input
            return 0.0;
        }
        
        if (amount > this.balance) {                // Desired amount is more than the available balance
            double allThatWeCan = this.balance;     // Empty the warehouse
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;       // Adjust the balance
        return amount;
    }

    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}

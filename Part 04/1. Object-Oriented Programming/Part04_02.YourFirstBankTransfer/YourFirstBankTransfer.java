/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 2 - Your First Bank Transfer


The Account from the previous exercise class is also available in this exercise.

Write a program that:

1. Creates an account named "Matthews account" with the balance 1000
2. Creates an account named "My account" with the balance 0
3. Withdraws 100.0 from Matthew's account
4. Deposits 100.0 to "my account"
5. Prints both the accounts
=================================================
*/

public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        
        // Create two "Account" objects 
        Account matthewAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        
        // Call some methods
        matthewAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        
        // Print the updates 
        System.out.println(matthewAccount);
        System.out.println(myAccount);
    }
}

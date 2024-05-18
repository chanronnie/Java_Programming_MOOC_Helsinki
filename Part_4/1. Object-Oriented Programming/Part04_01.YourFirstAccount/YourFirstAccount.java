/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 1 - Your First Account


Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, 
and finally prints the balance. NB! Perform all the operations in this exact order.
=================================================
*/

public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        
        Account myAccount = new Account("Ronnie's account", 100.0);
        myAccount.deposit(20.0);
        System.out.println(myAccount);
    }
}

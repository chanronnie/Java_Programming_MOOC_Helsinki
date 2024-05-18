/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 9 - Debt


Create a class Debt.
=================================================
*/

public class Main {

    public static void main(String[] args) {
        // Test your Debt class here
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;
        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}

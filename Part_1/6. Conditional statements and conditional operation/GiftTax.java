/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 37 - Gift Tax


A gift is a transfer of property to another person against no compensation or payment. 
If the total value of the gifts you receive from the same donor in the course of 3 years
is €5,000 or more, you must pay gift tax. When a gift is given by a close relative 
or a family member, the amount of gift tax is determined by the table shown on the website vero.fi.
For more information: https://www.vero.fi/en/individuals/property/gifts/

Write a program that calculates the gift tax for a gift from a close relative or a family member. 
=================================================
*/

import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user for a gift value
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        
        // Create variables for calculating the tax value
        int taxLowerLimit = 0;
        double taxRate = 0;
        int exceeding = 0;
        
        // Determinate the components for the tax gift value formula, depending on the gift amount
        if (giftValue < 5000) {
            System.out.println("No tax!");   
            return;                         
        } else if (giftValue < 25000) {
            taxLowerLimit = 100;
            taxRate = 0.08;
            exceeding = giftValue - 5000;
        } else if (giftValue < 55000) {
            taxLowerLimit = 1700;
            taxRate = 0.10;
            exceeding = giftValue - 25000;
        } else if (giftValue < 200000) {
            taxLowerLimit = 4700;
            taxRate = 0.12;
            exceeding = giftValue - 55000;
        } else if (giftValue < 1000000) {
            taxLowerLimit = 22100;
            taxRate = 0.15;
            exceeding = giftValue - 200000;
        } else {
            taxLowerLimit = 142100;
            taxRate = 0.17;
            exceeding =  giftValue - 1000000; 
        }
        
        // Print the tax gift value 
        System.out.println("Tax: " + (taxLowerLimit + exceeding * taxRate));
    }
}

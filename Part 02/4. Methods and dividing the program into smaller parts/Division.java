/*
============== Java Programming I ==============
Part 2
Section 4 - Methods and dividing the program into smaller parts
Ex 25 - Division


Write a method public static void division(int numerator, int denominator) 
that prints the result of the division of the numerator by the denominator. 
Keep in mind that the result of the division of the integers is an integer — 
in this case we want the result to be a floating point number.
=================================================
*/

public class Division {

    // Main program
    public static void main(String[] args) {
        division(3, 5);
    }

    
    // Define the method with two parameters
    public static void division(int numerator, int denominator) {
        
        // Handle division by 0
        if (denominator == 0) {
            System.out.println("Impossible to divide the given numerator by 0");
            return;
        }
        
        // Print the quotient
        System.out.println((double) numerator / denominator);
    }
}

/*
============== Java Programming I ==============
Part 2
Section 4 - Methods and dividing the program into smaller parts
Ex 30 - Smallest


Define a two-parameter method smallest that returns 
the smaller of the two numbers passed to it as parameters.
=================================================
*/

public class Smallest {

    // Define the method
    public static int smallest(int number1, int number2) {
        
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }

    
    // Main program
    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}

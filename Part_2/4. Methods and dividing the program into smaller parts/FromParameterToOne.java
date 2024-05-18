/*
============== Java Programming I ==============
Part 2
Section 4 - Methods and dividing the program into smaller parts
Ex 24 - From parameter to one


Create the following method in the exercise template: public static void printFromNumberToOne(int number). 
It should print the numbers from the number passed as a parameter down to one. 
=================================================
*/

public class FromParameterToOne {

    // Main program
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    
    // Define the method
    public static void printFromNumberToOne(int number) {
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}

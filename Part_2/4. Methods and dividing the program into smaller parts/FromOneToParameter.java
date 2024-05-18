/*
============== Java Programming I ==============
Part 2
Section 4 - Methods and dividing the program into smaller parts
Ex 23 - From one to parameter


Create the following method in the exercise template: public static void printUntilNumber(int number). 
It should print the numbers from one to the number passed as a parameter. 
=================================================
*/

import java.util.Scanner;

public class FromOneToParameter {

    // Main program
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number for which you wish to count from 1 to that number");
        int highestNum = Integer.valueOf(scanner.nextLine());
        printUntilNumber(highestNum);
    }
    
    
    // Define the method with a parameter
    public static void printUntilNumber(int endNumber) {
        
        int number = 1;
        while (number <= endNumber) {
            System.out.println(number);
            number++;
        }
    }
}

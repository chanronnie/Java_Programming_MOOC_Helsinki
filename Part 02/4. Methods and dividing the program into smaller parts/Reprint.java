/*
============== Java Programming I ==============
Part 2
Section 4 - Methods and dividing the program into smaller parts
Ex 22 - Reprint


Expand the previous program so that the main program asks the user 
for the number of times the phrase will be printed (i.e. how many times the method will be called).
=================================================
*/

import java.util.Scanner;

public class Reprint {

    // Main program
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int nTimes = Integer.valueOf(scanner.nextLine());
        
        while (nTimes > 0) {
            printText();
            nTimes--;
        }
    }
    
    // Define the method
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}

/*
============== Java Programming I ==============
Part 2
Section 3 - More loops
Ex 14 - Counting


Write a program that reads an integer from the user. 
Next, the program prints numbers from 0 to the number given by the user. 
You can assume that the user always gives a positive number. 
=================================================
*/

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number for which you wish to count from 0 to that number.");
        int end = Integer.valueOf(scanner.nextLine());
        
        for (int numberToPrint = 0; numberToPrint <= end; numberToPrint++) {
            System.out.println(numberToPrint);
        }
    }
}

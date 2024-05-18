/*
============== Java Programming I ==============
Part 2
Section 3 - More loops
Ex 15 - Counting to Hundred


Write a program, which reads an integer from the user. 
Then the program prints numbers from that number to 100. 
You can assume that the user always gives a number less than 100. 
=================================================
*/

import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number from which you would like to count up to 100:");
        int numberToPrint = Integer.valueOf(scanner.nextLine());
        
        while (numberToPrint <= 100) {
            System.out.println(numberToPrint);
            numberToPrint++;
        }
    }
}

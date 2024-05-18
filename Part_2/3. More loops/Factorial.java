/*
============== Java Programming I ==============
Part 2
Section 3 - More loops
Ex 19 - Factorial


Implement a program which calculates the factorial of a number given by the user (n!).
=================================================
*/

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user
        System.out.println("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        
        // Compute the factorial
        int factorial = 1;
        int number = 1;
        while (number <= n) {
            factorial *= number;
            number ++;
        }  
        System.out.println("Factorial: " + factorial);
    }
}

/*
============== Java Programming I ==============
Part 8
Section 1 - Short Recap
Ex 2 - Average of positive numbers


Implement a program that computes the average of given positive integers.
The program ends when the user inputs "0", and skips any negative number.
=================================================
*/

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        while (true) {
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum += number;
                count++;
            }
        }

        // Output the average
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / count);
        }    
    }
}

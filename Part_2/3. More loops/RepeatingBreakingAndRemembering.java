/*
============== Java Programming I ==============
Part 2
Section 3 - More loops
Ex 20 - Repeating Breaking And Remembering


Write a program that repeatedly reads a number from the user until the input is -1.
Once the input is -1, the program prints the following results:
- a message: "Thx! Bye!"
- the sum of the numbers
- the total number of inputs
- the average of the numbers
- the total number of even numbers 
- the total number of odd numbers 
=================================================
*/

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        
        int sum = 0;
        int counter = 0;
        int evenNum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
        
            // Exit the loop if input is -1
            if (number == -1) {
                break;
            }
            
            // Check if the number is even or odd
            if (number % 2 == 0) {
                evenNum += 1;
            } 
            
            // Perform computations for valid input
            sum += number;
            counter += 1;
        }
        
        // Output the results
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (1.0*sum/counter));
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + (counter - evenNum));
    }
}

/*
============== Java Programming I ==============
Part 2
Section 2 - Repeating functionality
Ex 6 - Are We There Yet?


Write a program, according to the preceding example, 
that asks the user to input values until they input the value 4.
=================================================
*/

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 4) {
                break;
            }
        }
    }
}

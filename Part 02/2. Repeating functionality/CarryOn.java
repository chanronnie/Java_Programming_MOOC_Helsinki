/*
============== Java Programming I ==============
Part 2
Section 2 - Repeating functionality
Ex 5 - Carry On


Write a program by using the loop example that asks "Shall we carry on?" 
until the user inputs the string "no".
=================================================
*/

import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            // Prompt the user for input
            System.out.println("Shall we carry on? (yes/no): ");
            String answer = scanner.nextLine();
            
            // Leave the loop if input is "no"
            if (answer.equals("no")) {
                break;
            }
        }
    }
}

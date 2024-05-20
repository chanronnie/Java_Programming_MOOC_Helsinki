/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 22 - Cubes


Create a program that reads numbers in string form from the user and outputs the cube of each number.
The program stops when the user inputs "end".
=================================================
*/

import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs from the user
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            // Convert the input into integer type and output its cube
            int number = Integer.valueOf(input);
            System.out.println((int) Math.pow(number, 3));
        }
    }
}

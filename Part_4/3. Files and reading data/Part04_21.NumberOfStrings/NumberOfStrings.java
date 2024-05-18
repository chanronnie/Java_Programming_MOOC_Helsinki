/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 21 - Number Of Strings


Create a program that reads strings from the user until the input is "end".
It outputs the number of strings given after reading.
=================================================
*/

import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read strings from the user
        int nbStrings = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            nbStrings++;
        }
        
        // Output the number of strings
        System.out.println(nbStrings);
    }
}

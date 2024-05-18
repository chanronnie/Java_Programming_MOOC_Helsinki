/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 9 - Greatest in list


Continue developing the program so that it finds the greatest number in the list 
and prints its value after reading all the numbers. 
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int greatestNum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }

            // Populate the list
            list.add(input);
            
            // Search for the greatest num
            if (greatestNum < input) {
                greatestNum = input;
            }
        }
        
        // Output the greatest number
        System.out.println("");
        System.out.println("The greatest number: " + greatestNum);
    }
}

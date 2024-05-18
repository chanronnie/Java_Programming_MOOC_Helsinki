/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 11 - Index of smallest


Write a program that reads numbers from the user. 
When number 9999 is entered, the reading process stops. 
After this the program will print the smallest number in the list, 
and also the indices where that number is found. 
Notice: the smallest number can appear multiple times in the list.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Populate the list
        int smallest = 1000;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 9999) {
                break;
            }
            
            list.add(input);
            
            if (smallest > input) {
                smallest = input;
            }
        }
        
        // Print the smallest number and its index(es)
        System.out.println("Smallest number: " + smallest);
        for (int index = 0; index < list.size(); index++) {
            if (smallest == list.get(index)) {
                System.out.println("Found at index: " + index);
            }
        }  
    }
}

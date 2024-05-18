/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 8 - Only these numbers


Expand the program to ask for a start and end indices once it has finished asking for numbers. 
After this the program shall prints all the numbers in the list that fall in the specified range (between the indices given by the user, inclusive). 
You may assume that the user gives indices that match some numbers in the list.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Populate the list
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }
        
        
        // Prompt the user for a range
        int printingIndexFrom = 0;
        int printingIndexTo = 0;
        
        while (true) {
            
            System.out.println("From where? ");
            printingIndexFrom = Integer.valueOf(scanner.nextLine());
            System.out.println("To where? ");
            printingIndexTo = Integer.valueOf(scanner.nextLine());
            
            // Valid range
            if (printingIndexFrom < printingIndexTo) {
                break;
            } 

            // Invalid range 
            System.out.println("Please re-input correct range of numbers");
        }
        
        // Output the numbers
        while (printingIndexFrom <= printingIndexTo) {
            System.out.println(numbers.get(printingIndexFrom));
            printingIndexFrom++;
        }
    }
}

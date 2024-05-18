/*
============== Java Programming I ==============
Part 3
Section 3 - Arrays
Ex 19 - Index Was Not Found


Complete the program so that it asks the user for a number to search in the array. 
If the array contains the given number, the program tells the index containing the number. 
If the array doesn't contain the given number, the program will advise that the number wasn't found.
=================================================
*/

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Populate the array
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        // Prompt the user for a number to search in the array
        System.out.println("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Proceed with the search
        int index = 0;
        boolean found = false;
        while (index < array.length) {
            if (array[index] == searching) {
                found = true;
                break;
            }
            index++;
        }
        
        if (found) {
            System.out.println(searching + " is at index " + index + ".");
        } else {
            System.out.println(searching + " was not found.");
        }
    }
}

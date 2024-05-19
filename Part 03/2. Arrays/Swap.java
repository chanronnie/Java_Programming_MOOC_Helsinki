/*
============== Java Programming I ==============
Part 3
Section 3 - Arrays
Ex 18 - Swap


Create a program that swaps the values of two given indices and prints the updated array.
=================================================
*/

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Populate the array
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Prompt the user for indices and swap the values at the given indices
        System.out.println("Give two indices to swap:");
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());
        
        int temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;

        // Output the updated array
        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }
}

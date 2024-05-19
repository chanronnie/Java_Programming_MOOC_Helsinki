/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 13 - Average of a list


Modify the program so that after reading the numbers it calculates 
and prints the average of the numbers in the list.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            list.add(input);
            sum += input;
        }
        
        // Compute and output the average
        System.out.println();
        System.out.println("Average: " + (1.0* sum / list.size()));
    }
}

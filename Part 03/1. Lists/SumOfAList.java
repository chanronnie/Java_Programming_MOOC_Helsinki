/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 12 - Sum of a list


Modify the program so that after reading the numbers it calculates 
and prints the sum of the numbers in the list.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Populate the list
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        // Compute and output the sum
        System.out.println("");
        int sum = 0;
        for (int number: list) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}

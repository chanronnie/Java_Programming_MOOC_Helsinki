/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 10 - Index Of


Expand the program by adding a functionality that asks the user for a number, 
and reports that number's index in the list. 
If the number is not found, the program should not print anything.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        // Prompt the user for a number 
        System.out.println("");
        System.out.println("Search for? ");
        int numberToSearch = Integer.valueOf(scanner.nextLine());
        
        // Output the result
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) == numberToSearch) {
                System.out.println(numberToSearch + " is at index " + index);
            }
        } 
    }
}

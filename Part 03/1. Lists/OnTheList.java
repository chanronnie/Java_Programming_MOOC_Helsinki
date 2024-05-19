/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 14 - On The List?


Write a program that checks if the populated list contains the given input.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Populate the list
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        // Prompt the user for an input to search and output the result
        System.out.println("Search for? ");
        String searching = scanner.nextLine();
        
        if (list.contains(searching)) {
            System.out.println(searching + " was found!");
        } else {
            System.out.println(searching + " was not found!");
        }
    }
}

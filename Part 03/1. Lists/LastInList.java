/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 5 - Last in list


Modify the program so that it prints the last element in the list using the method size.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        // Output the last element of the list
        int lastElement = list.size() - 1;
        System.out.println(list.get(lastElement));
    }
}

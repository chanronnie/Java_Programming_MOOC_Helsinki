/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 4 - List Size


Modify the program so that it also prints the size of the list.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

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
        
        // Print the number of elements in the list (size)
        System.out.println("In total: " + list.size());
    }
}

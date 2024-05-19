/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 6 - First and last


Modify the program to print both the first and the last values after the reading ends. 
You may suppose that at least two values are read into the list.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

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
        
        // Output the first and last element
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }
}

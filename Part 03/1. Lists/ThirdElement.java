/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 1 - Third Element


Modify the program so that it prints the third element of the list instead of the first element.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

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

        System.out.println(list.get(2));
    }
}

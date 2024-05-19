/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 7 - Remember these numbers


Expand the functionality of the program so that after reading the numbers, 
it prints all the numbers received from the user. 
The number used to indicate stopping should not be printed.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
        
        // Output all the input numbers in the list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}

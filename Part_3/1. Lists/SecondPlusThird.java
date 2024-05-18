/*
============== Java Programming I ==============
Part 3
Section 2 - Lists
Ex 2 - Second Plus Third


Modify the program so that it prints the sum of the second and third numbers in the list intead of the first element.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            numbers.add(number);
        }

        // Print the sum of the second and third numbers
        System.out.println(numbers.get(1) + numbers.get(2));
    }
}

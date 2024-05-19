/*
============== Java Programming I ==============
Part 8
Section 1 - Short Recap
Ex 1 - Cubes


Implement a program that outputs the cube of a number given by the user.
=================================================
*/

import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(input);
            System.out.println(number * number * number);
        }

    }
}

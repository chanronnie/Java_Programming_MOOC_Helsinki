/*
============== Java Programming I ==============
Part 2
Section 3 - More loops
Ex 16 - From where to where


PART 1: Write a program which prints the integers from 1 to a number given by the user.
PART 2: Ask the user for the starting point as well.
=================================================
*/

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // PART 1
        System.out.println("Where to?");
        int upperLimit = Integer.valueOf(scanner.nextLine());
        
        for(int printing = 1; printing <= upperLimit; printing++) {
            System.out.println(printing);
        }
        

        // PART 2
        System.out.println("Where to?");
        int upper = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int lower = Integer.valueOf(scanner.nextLine());
        
        while (lower <= upper) {
            System.out.println(lower);
            lower++;
        }
    }
}

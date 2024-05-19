/*
============== Java Programming I ==============
Part 1
Section 6 - Conditional statements and conditional operation
Ex 29 - Adulthood


Write a program that prompts the user for their age and tells them 
whether or not they are an adult (18 years old or older).
=================================================
*/

import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        if (age < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }
    }
}

/*
============== Java Programming I ==============
Part 3
Section 4 - Using strings
Ex 23 - Print Thrice


Write a program, that reads a string from the user and then prints it three times.
NB! The program should ask for only one string. Don't use a loop here.
=================================================
*/

import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        System.out.println();
        System.out.println(word + word + word);
    }
}

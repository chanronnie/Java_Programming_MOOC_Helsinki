/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 8 - Biggest Pet Shop


Complete the program as directed by the instructions.
=================================================
*/

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);

        System.out.println(leo);
    }
}

/*
============== Java Programming I ==============
Part 3
Section 4 - Using strings
Ex 26 - Line By Line


Write a program that reads strings from the user. 
If the input is empty, the program stops reading input and halts. 
For each non-empty input it splits the string input by whitespaces
and prints each part of the string on a new line.
=================================================
*/

import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String givenStrings = "";
        while (true) {
            String input = scanner.nextLine();
            
            if (input.length() == 0) {
                break;
            }
            
            givenStrings += input + " ";
        }
        
        // Split strings into pieces and print them out
        String[] pieces = givenStrings.split("\\s+");
        for (String string: pieces) {
            System.out.println(string);
        }
    }
}

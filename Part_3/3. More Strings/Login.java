/*
============== Java Programming I ==============
Part 3
Section 4 - Using strings
Ex 25 - Login


Write a program that check if the given username and password are valid.
This program recognizes only the two following users:
| -------- | -------- |
| username | password |
| -------- | -------- |
| alex     | sunshine |
| emma     | haskell  |
=================================================
*/

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user 
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        // Create arrays to store existing usernames and passwords
        // The corresponding matched username and password have the same index in the arrays
        String[] usernameArray = {"alex", "emma"};
        String[] passwordArray = {"sunshine", "haskell"};
        
        // Check if the given username and password are valid
        boolean matched = false;
        for (int index = 0; index < usernameArray.length; index++) {
            if (username.equals(usernameArray[index])) {
                if (password.equals(passwordArray[index])) {
                    matched = true;
                } 
                break;
            }
        }
        
        // Output the result
        if (matched) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }                
    }
}

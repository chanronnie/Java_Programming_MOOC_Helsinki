/*
============== Java Programming I ==============
Part 4
Section 3 - Files and reading data
Ex 26 - Guest List From A File


Create a program that checks if the user name is on the guest list.
=================================================
*/

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        
        // Read file name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        // Read file contents
        ArrayList<String> list = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String guestName = fileReader.nextLine();
                list.add(guestName);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Check if the user name is on the guest list 
        System.out.println("");
        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}

/*
============== Java Programming I ==============
Part 4
Section 2 - Objects in a list
Ex 18 - Personal Information


Implement a program that uses the PersonalInformation class, as directed by the instructions.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Read information from the user
        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            
            if (firstName.isEmpty()) {
                break;
            }
                        
            System.out.println("Last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Identification number: ");
            String id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        
        // Output the fist names and last names
        System.out.println("");
        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName() + " " +info.getLastName());
        }
    }
}

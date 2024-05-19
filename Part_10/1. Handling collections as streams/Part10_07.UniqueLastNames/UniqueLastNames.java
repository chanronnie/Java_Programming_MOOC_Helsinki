/*
============== Java Programming II ==============
Part 10
Section 1 - Handling collections as streams
Ex 7 - Unique last names


Implement a program that reads personal information from the user (first name, last name, and birth year)
and prints the unique last names in alphabetical order.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String continueQ = "quit";
            
            if(scanner.hasNextLine()){
                continueQ = scanner.nextLine();
            }

            if (continueQ.equals("quit")) {
                break;
            }

            // Prompt the user for information
            System.out.print("Input first name: ");
            String firstName = "NaN";
            if(scanner.hasNextLine()){firstName = scanner.nextLine();}
            System.out.print("Input last name: ");
            String lastName = "NaN";
            if(scanner.hasNextLine()){lastName = scanner.nextLine();}
            System.out.print("Input the year of birth: ");
            int birthYear = 0;
            if(scanner.hasNextLine()){birthYear = Integer.valueOf(scanner.nextLine());}

            // Add the person to the list of Persons
            persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        }

        // Print the results
        System.out.println("Unique last names in alphabetical order:");
        persons.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}

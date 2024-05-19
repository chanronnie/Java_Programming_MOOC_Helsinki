/*
============== Java Programming I ==============
Part 5
Section 4 - Objects and references
Ex 15 - Archive


Complete the program as directed by the instructions.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> uniqueItems = new ArrayList<>();

        while (true) {
            
            // Prompt the user for the item information
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            // Add unique item to the list
            Item item = new Item(identifier, name);
            if (!uniqueItems.contains(item)) {
                uniqueItems.add(item);
            } 
        }
        
        // Output the unique items 
        System.out.println("==Items==");
        for(Item item: uniqueItems) {
            System.out.println(item);
        }
    }
}

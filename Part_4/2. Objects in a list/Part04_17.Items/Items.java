/*
============== Java Programming I ==============
Part 4
Section 2 - Objects in a list
Ex 17 - Items


Implement a program that uses the Item class, as directed by the instructions.
=================================================
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Read information from the user
        while (true) {
            System.out.println("Name: ");
            String itemName = scanner.nextLine();
            
            if (itemName.isEmpty()) {
                break;
            }
            
            items.add(new Item(itemName));
        }
        
        // Output the list content
        for (Item item: items) {
            System.out.println(item);
        }
    }
}

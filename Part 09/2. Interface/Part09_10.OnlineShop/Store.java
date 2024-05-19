/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 10 - Online shop


Implement an interactive program that simulates the functionality of an e-commerce shop.
=======
*/

import java.util.Scanner;

public class Store {

    // Private fields
    private Warehouse warehouse;
    private Scanner scanner;

    // Constructor
    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // Method
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            
            if (product.isEmpty()) {
                break;
            }
            
            if (this.warehouse.stock(product) > 0) {
                this.warehouse.take(product);
                cart.add(product, this.warehouse.price(product));
                
            } else if (!this.warehouse.products().contains(product)) {
                System.out.println("Product <" + product + "> is not found");
                
            } else {
                System.out.println("Product <" + product + "> is out of stock");
            }
        }

        System.out.println("your shopping cart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}

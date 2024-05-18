/*
============== Java Programming I ==============
Part 4
Section 1 - Introduction to object-oriented programming
Ex 7 - Product


Create a class Product that represents a store product. 
The product should have a price (double), a quantity (int) and a name (String).

The class should have:
the constructor public Product (String initialName, double initialPrice, int initialQuantity)
a method public void printProduct() that prints product information in the following format:
=================================================
*/

public class Product {
    
    // Private fields
    private String name;
    private double price;
    private int quantity;
    
    // Constructor
    public Product (String initialName, double initialPrice, int initialQuantity) {
       this.name = initialName;
       this.price = initialPrice;
       this.quantity = initialQuantity;
   }
    
    // Method that prints the product information
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
}

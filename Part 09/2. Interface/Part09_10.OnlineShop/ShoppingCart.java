/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 10 - Online shop


Implement an interactive program that simulates the functionality of an e-commerce shop.
=======
*/

import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        this.cart.putIfAbsent(product, new Item(product, 1, price));
        this.cart.get(product).increaseQuantity();
    }
    
    public int price() {
        int price = 0;
        for (Item item: this.cart.values()) {
            price += item.price();
        }
        return price;
    }
    
    public void print() {
        for (Item item: this.cart.values()) {
            System.out.println(item);
        }
    } 
}

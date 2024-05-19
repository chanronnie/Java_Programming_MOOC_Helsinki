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
import java.util.Set;

public class Warehouse {
    
    // Private fields
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    // Constructor
    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        return this.prices.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.stocks.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (this.stocks.containsKey(product) && this.stocks.get(product) > 0 ) {
            this.stocks.put(product, this.stocks.get(product) - 1);
            return true;
        }
       
        return false;
    }
    
    public Set<String> products() {
        return this.prices.keySet();
    }
}


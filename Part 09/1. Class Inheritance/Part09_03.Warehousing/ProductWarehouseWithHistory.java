/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 3 - Warehousing 


Implement classes that utilize class inheritance concepts.
=================================================
*/

public class ProductWarehouseWithHistory extends ProductWarehouse{ 
    
    // Private field
    private ChangeHistory changes;
    
    // Constructor
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        
        this.changes = new ChangeHistory();
        addToWarehouse(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changes.add(super.getBalance());
        
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double inputAmount = super.takeFromWarehouse(amount);
        this.changes.add(super.getBalance());
        return inputAmount;
    }
    
    public String history() {
        return this.changes.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.changes.maxValue());
        System.out.println("Smallest amount of product: " + this.changes.minValue());
        System.out.println("Average: " + this.changes.average());
    }
    
}

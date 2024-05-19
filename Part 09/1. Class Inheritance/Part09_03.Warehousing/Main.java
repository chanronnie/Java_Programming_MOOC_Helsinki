/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 3 - Warehousing 


Implement classes that utilize class inheritance concepts.
=================================================
*/

public class Main {

    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
        
    }

}

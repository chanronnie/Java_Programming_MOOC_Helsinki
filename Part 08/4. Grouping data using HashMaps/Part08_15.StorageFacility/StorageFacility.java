/*
============== Java Programming II ==============
Part 8
Section 4 - Grouping data using hash maps
Ex 15 - Storage facility


Implement a program for managing a storage facility using a HashMap.
=================================================
*/

import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        
        if (!this.storage.containsKey(storageUnit)) {
            return;
        }
        
        ArrayList<String> items = this.storage.get(storageUnit);
        items.remove(item);
        if (items.isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> printingUnits = new ArrayList<>();
        for (String unit: this.storage.keySet()) {
            if (this.storage.get(unit) != null) {
                printingUnits.add(unit);
            }
        }
        return printingUnits;
    }
}

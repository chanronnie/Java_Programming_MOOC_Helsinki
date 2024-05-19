/*
============== Java Programming II ==============
Part 8
Section 3 - Similarity of objects
Ex 13 - Vehicle Registry 


Implement a program for registering vehicle owners and license plates using a HashMap.
=================================================
*/

import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        boolean foundLicense = this.registry.containsKey(licensePlate);
        boolean hasOwner = this.registry.get(licensePlate) != null;
        
        if (foundLicense && hasOwner) {
            return false;
        }
        
        this.registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!this.registry.containsKey(licensePlate)) {
            return false;
        }
        
        this.registry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licenseplate: this.registry.keySet()) {
            System.out.println(licenseplate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> uniqueOwners = new ArrayList<>();
        for (String owner: this.registry.values()) {
            if (!uniqueOwners.contains(owner)) {
                uniqueOwners.add(owner);
                System.out.println(owner);
            }
        }
    }
}

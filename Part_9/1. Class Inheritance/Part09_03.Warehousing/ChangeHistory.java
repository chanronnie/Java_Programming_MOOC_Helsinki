/*
============== Java Programming II ==============
Part 9
Section 1 - Class inheritance
Ex 3 - Warehousing 


Implement classes that utilize class inheritance concepts.
=================================================
*/

import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    @Override
    public String toString() {
        return (String) this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double max = this.history.get(0);
        for (int index=1; index <this.history.size(); index++) {
            if (this.history.get(index) > max) {
                max = this.history.get(index);
            }
        }
        return max;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double min = this.history.get(0);
        for (int index=1; index <this.history.size(); index++) {
            if (this.history.get(index) < min) {
                min = this.history.get(index);
            }
        }
        return min;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0;
        for (Double balance: this.history) {
            sum += balance;
        }
        return sum/this.history.size();
    }
}

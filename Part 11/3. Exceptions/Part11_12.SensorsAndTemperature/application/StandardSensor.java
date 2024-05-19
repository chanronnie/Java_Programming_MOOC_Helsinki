/*
============== Java Programming II ==============
Part 11
Section 3 - Exzceptions
Ex 12 - Sensors and temperature


Implement a program using interface, classes and Exception.
=================================================
*/

package application;

public class StandardSensor implements Sensor {
    
    private int value;
    
    public StandardSensor(int value) {
        this.value = value;
    }
    
    @Override 
    public boolean isOn() {
        return true;
    }
    
    @Override 
    public void setOn() {
    }
    
    @Override 
    public void setOff() {
    }
    
    @Override
    public int read() {
        return this.value;
    }
}
